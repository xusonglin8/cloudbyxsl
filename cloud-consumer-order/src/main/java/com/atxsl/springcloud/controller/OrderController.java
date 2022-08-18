package com.atxsl.springcloud.controller;

import com.atxsl.springcloud.entities.CommonResult;
import com.atxsl.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@Slf4j
public class OrderController {
    @Autowired
    private IOrderController orderController;
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private  RestTemplate restTemplate;
    @RequestMapping("/consumer/create")
    public CommonResult<Payment> create(Payment payment) {
        return orderController.create(payment);
    }
    @RequestMapping("/consumer/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") String id) {
        CommonResult<Payment> paymentById = orderController.getPaymentById(id);
        return paymentById;
    }
}
