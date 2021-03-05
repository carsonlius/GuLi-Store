package com.carsonlius.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 想要远程调用别的服务
 *  1. 引入openfen
 *  2. 编写一个接口，告诉spring-boot需要调用远程服务
 *
 * */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages="com.carsonlius.gulimall.member.feign")
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
