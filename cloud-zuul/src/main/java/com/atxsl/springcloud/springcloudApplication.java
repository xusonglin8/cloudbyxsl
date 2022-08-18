package com.atxsl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author xusonglin
 * @date 2020/9/22 - 13:28
 */
@SpringBootApplication
@EnableZuulProxy // 开启Zuul
public class springcloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(springcloudApplication.class,args);
    }
}
