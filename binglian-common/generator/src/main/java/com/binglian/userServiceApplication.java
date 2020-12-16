package com.binglian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.binglian.mapper")
public class userServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(userServiceApplication.class, args);
    }
}
