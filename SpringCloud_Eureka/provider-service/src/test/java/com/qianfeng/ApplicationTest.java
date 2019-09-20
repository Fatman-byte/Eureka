package com.qianfeng;

import com.qianfeng.mapper.UserMapper;
import com.qianfeng.pojo.TbUser;
import com.qianfeng.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * author:刘强
 * date:2019/9/1919:41
 * description:测试Mappper和Service
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BootApplication.class})
public class ApplicationTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    /**
     * 测试Mapper连接数据库
     */
    @Test
    public void test01(){
        TbUser user = userMapper.getUserById(Long.valueOf(2));
        System.out.println(user);
    }
    /**
     * 测试Service
     */
    @Test
    public void test02() throws Exception {
        TbUser user = userService.getUserById(Long.valueOf(1));
        System.out.println(user);
    }
}
