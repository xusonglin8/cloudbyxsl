package com.atxsl.springcloud.service.impl;

import com.atxsl.springcloud.dao.PaymentDao;
import com.atxsl.springcloud.entities.Payment;
import com.atxsl.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author xusonglin
 * @date 2020/9/22 - 19:32
 */
@Service
public class PanymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public void create(Payment payment){
         paymentDao.save(payment);
    }
    @Override
    public Payment getPaymentById(String id){
        return paymentDao.getPaymentById(id);
    }
}
