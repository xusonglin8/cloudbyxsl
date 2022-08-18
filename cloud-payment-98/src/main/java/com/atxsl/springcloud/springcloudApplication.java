package com.atxsl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author xusonglin
 * @date 2020/9/22 - 13:28
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker // 添加对熔断的支持注解
@EnableHystrixDashboard
public class springcloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(springcloudApplication.class,args);
    }
}
