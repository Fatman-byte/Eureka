package com.qianfeng.controller;

import com.qianfeng.pojo.TbUser;
import com.qianfeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:刘强
 * date:2019/9/1920:02
 * description:方法的调用
 */
@RestController
@RequestMapping("/provider")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public TbUser getUserById(@PathVariable Long id) throws Exception {
        return userService.getUserById(id);
    }
}
