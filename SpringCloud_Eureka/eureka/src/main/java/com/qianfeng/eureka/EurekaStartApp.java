package com.qianfeng.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * author:刘强
 * date:2019/9/208:37
 * description:启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaStartApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStartApp.class,args);
    }
}
