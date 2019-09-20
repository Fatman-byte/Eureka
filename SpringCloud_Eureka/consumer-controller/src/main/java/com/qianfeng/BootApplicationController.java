package com.qianfeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * author:刘强
 * date:2019/9/1921:04
 * description:启动类
 */
@SpringBootApplication
@EnableDiscoveryClient //开启服务发现客户端
public class BootApplicationController {
    public static void main(String[] args) {
        SpringApplication.run(BootApplicationController.class,args);
    }
    @Bean
    public RestTemplate template(){
        return new RestTemplate();
    }
}
