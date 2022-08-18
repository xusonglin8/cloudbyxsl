package com.atxsl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author xusonglin
 * @date 2020/9/22 - 13:28
 */
@SpringBootApplication
@EnableConfigServer
public class springcloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(springcloudApplication.class,args);
    }
}
