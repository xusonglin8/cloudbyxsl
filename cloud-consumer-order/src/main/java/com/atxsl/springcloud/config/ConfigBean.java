package com.atxsl.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xusonglin
 * @date 2022/8/16 - 18:33
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplateBean(){
        return new RestTemplate();
    }
}
