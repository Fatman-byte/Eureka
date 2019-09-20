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
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;

    @RequestMapping("/orders/{id}")
    public TbUser getOrderById(@PathVariable Long id){
        //参数1，提供者在Eureka中注册的名字
        InstanceInfo info = eurekaClient.getNextServerFromEureka("04PROVIDER-EUREKA", false);
        String url = info.getHomePageUrl();//获取服务器的地址 http://localhost:10000
        System.out.println("url = " + url);
        TbUser user = restTemplate.getForObject(url + "/provider/user/" + id, TbUser.class);
        return user;
    }
}
