package com.atxsl.springcloud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author xusonglin
 * @date 2020/9/24 - 12:46
 */
@Configurable
public class ApplicationContext {
    @Autowired
    private RestTemplateBuilder builder;
    @Bean
    public RestTemplate restTemplate() {
        // Do any additional configuration here
        RestTemplate restTemplate = builder.build();
        return restTemplate;
    }
}
