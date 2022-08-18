package com.atxsl.springcloud.service;

import com.atxsl.springcloud.entities.Payment;

/**
 * @author xusonglin
 * @date 2020/9/22 - 19:28
 */
public interface PaymentService {
     void create(Payment payment);
     Payment getPaymentById(String id);
}
