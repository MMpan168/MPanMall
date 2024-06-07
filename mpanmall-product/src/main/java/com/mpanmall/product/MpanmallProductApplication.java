package com.mpanmall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MpanmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpanmallProductApplication.class, args);
    }

}
