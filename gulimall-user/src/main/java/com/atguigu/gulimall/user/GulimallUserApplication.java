package com.atguigu.gulimall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.atguigu.gulimall.user.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallUserApplication.class, args);
    }

}
