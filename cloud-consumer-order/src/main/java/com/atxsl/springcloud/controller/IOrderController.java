package com.atxsl.springcloud.controller;

import com.atxsl.springcloud.entities.CommonResult;
import com.atxsl.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author xusonglin
 * @date 2022/8/16 - 18:02
 */
@Component
@FeignClient(value = "cloud-payment-service")
public interface IOrderController {
    @PostMapping("/payment/create")
    public CommonResult<Payment> create(Payment payment);
    @GetMapping("/payment/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") String id) ;
}
