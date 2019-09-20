package com.qianfeng.service.Impl;

import com.qianfeng.mapper.UserMapper;
import com.qianfeng.pojo.TbUser;
import com.qianfeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author:刘强
 * date:2019/9/1919:19
 * description:业务逻辑代码
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public TbUser getUserById(Long id) throws Exception {
        return userMapper.getUserById(id);
    }
}
