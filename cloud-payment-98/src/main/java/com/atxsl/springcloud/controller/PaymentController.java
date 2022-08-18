package com.atxsl.springcloud.controller;

import com.atxsl.springcloud.entities.CommonResult;
import com.atxsl.springcloud.entities.Payment;
import com.atxsl.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xusonglin
 * @date 2020/9/22 - 20:19
 */
@RestController
@Slf4j
@RequestMapping(value="/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Payment payment){
        CommonResult<Payment> response = null;
        try{
            for (int i = 0 ; i<100000;i++){
                System.out.println(1);
            }
            paymentService.create(payment);
            response = new CommonResult(200,"成功，端口号为："+serverPort);
        }
        catch (Exception e){
            String errorMessage = "插入失败";
            response = new CommonResult(500,errorMessage,payment);
        }
       return response;
    }
    @HystrixCommand(fallbackMethod = "hystrixGet")
    @GetMapping(value = "/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable String id){
        CommonResult<Payment> response = null;
        try{
            Payment payment = paymentService.getPaymentById(id);
            log.info("获取结果+"+payment);

            List<String> services = discoveryClient.getServices();
            for(String ele:services){
                log.info("ele:"+ele);
            }
            List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
            for(ServiceInstance instance:instances){
                log.info(instance.getHost()+instance.getInstanceId()+instance.getPort()+instance.getServiceId()+instance.getUri());
            }
            if (payment == null){
                throw new RuntimeException("这个id=>"+id+",不存在该用户，或信息无法找到~");
            }
            response = new CommonResult(200,"获取成功",payment.toString());
        }
        catch (Exception e){
            String errorMessage = "获取失败";
            response = new CommonResult(500,errorMessage,id);
            throw new RuntimeException(e.getMessage());
        }
        return response;
    }

    /**
     * 根据id查询备选方案(熔断)
     * @param id
     * @return
     */
    public CommonResult hystrixGet(@PathVariable String id){
        return new CommonResult(200,"这个id=>"+id+",没有对应的信息,null---@Hystrix~",null);
    }
}
