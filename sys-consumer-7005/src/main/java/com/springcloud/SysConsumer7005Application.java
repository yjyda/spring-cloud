package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages="com.springcloud") //开启扫描公共代码
@EnableEurekaClient
@SpringBootApplication
public class SysConsumer7005Application {

    public static void main(String[] args) {
        SpringApplication.run(SysConsumer7005Application.class, args);
    }
}
