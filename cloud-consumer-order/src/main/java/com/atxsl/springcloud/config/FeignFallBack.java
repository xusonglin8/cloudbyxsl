/*
package com.atxsl.springcloud.config;

import com.atxsl.springcloud.controller.IOrderController;
import com.atxsl.springcloud.entities.CommonResult;
import com.atxsl.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

*
 * @author xusonglin
 * @date 2022/8/16 - 20:46
 *


@Component
public class FeignFallBack implements IOrderController{
    @Override
    public CommonResult<Payment> create(Payment payment) {
        return new CommonResult<Payment>(405,"负载均衡调用失败");
    }

    @Override
    public CommonResult<Payment> getPaymentById(Long id) {
        return new CommonResult(405,"负载均衡调用失败",id);
    }
}
*/
