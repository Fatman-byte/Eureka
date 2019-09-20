package com.qianfeng.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * author:刘强
 * date:2019/9/208:37
 * description:Eureka注册中心服务：
 * 第一步：导入 springcloud继承的Eureka注册中心的依赖
 * 第二步：配置文件 ，规定Eureka注册中心的集群，和register等布尔类型以及注册中心的Tomcat端口号
 * 第三步：加注解，在启动类上加注解，意思为自动启动Eureka注册中心的Server方法
 */
@SpringBootApplication
@EnableEurekaServer  // 自动启动Eureka注册中心的Server方法
public class EurekaStartApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStartApp.class,args);
    }
}
