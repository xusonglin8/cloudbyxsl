package com.atxsl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xusonglin
 * @date 2020/9/22 - 13:28
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class springcloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(springcloudApplication.class,args);
    }
}
