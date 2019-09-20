package com.qianfeng.service;


import com.qianfeng.pojo.TbUser;

/**
 * author:刘强
 * date:2019/9/1918:00
 * description:服务的提供者中的service
 */
public interface UserService {
    TbUser getUserById(Long id)throws Exception;
}
