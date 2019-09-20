package com.qianfeng.usercontroller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.qianfeng.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * author:刘强
 * date:2019/9/1921:08
 * description:消费者
 */
@RestController
@RequestMapping("/consumer")
public class UserController {
    //1.Controller 中 RestTemplate 客户端的注入类
    @Autowired
    private RestTemplate restTemplate;
    //2.controller 中 EurekaClient    Eureka的客户端类
    @Autowired
    private EurekaClient eurekaClient;

    @RequestMapping("/orders/{id}")
    public TbUser getOrderById(@PathVariable Long id){
        //3.客户端的类对象通过提供者在注册中心注册的名字，获取注册中心这个提供者的实例对象
        //参数1，提供者在Eureka中注册的名字
        InstanceInfo info = eurekaClient.getNextServerFromEureka("06PROVIDER-EUREKA", false);
        //4.提供者的实例对象通过getHomePageUrl()方法获取提供者在注册中心的url路径
        String url = info.getHomePageUrl();//获取服务器的地址 http://localhost:10000
        System.out.println("url = " + url);
        //5.客户端注入类的对象调用以下方法，使用提供者在注册中心的ip拼接提供者的访问相对路径完成访问
        TbUser user = restTemplate.getForObject(url + "/provider/user/" + id, TbUser.class);//类对象 类型 restTemplate是客户端
        return user;
    }
}
