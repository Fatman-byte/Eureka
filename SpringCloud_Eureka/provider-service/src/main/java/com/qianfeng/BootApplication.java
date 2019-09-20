package com.qianfeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * author:刘强
 * date:2019/9/1919:43
 * description:启动类
 */
//2.启动类 扫描DAO时要注意指定完整的包路径(@MapperScan("com.qianfeng.mapper"))，不可指定整个大范围的包路径，避免将Service的接口也扫描进来，导致找到两个DAO属性类，或找不DAO实现的Sql方法（Service的接口类一定是没有sql实现的）
@MapperScan("com.qianfeng.mapper")
@SpringBootApplication
//@EnableEurekaClient //开启服务发现，这个只针对Eureka
@EnableDiscoveryClient //开启服务发现的客户端
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class,args);
    }
}
