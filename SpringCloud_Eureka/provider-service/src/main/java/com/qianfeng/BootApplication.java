package com.qianfeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * author:刘强
 * date:2019/9/1919:43
 * description:启动类
 */
@MapperScan("com.qianfeng.mapper")
@SpringBootApplication
//@EnableEurekaClient //开启服务发现，这个只针对Eureka
@EnableDiscoveryClient //开启服务发现的客户端
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class,args);
    }
}
