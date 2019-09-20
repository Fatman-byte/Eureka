package com.qianfeng.mapper;

import com.qianfeng.pojo.TbUser;
import org.apache.ibatis.annotations.Select;

/**
 * author:刘强
 * date:2019/9/1919:20
 * description:SQL语句的实现
 */

public interface UserMapper {
    @Select("SELECT id,NAME,birth,salary,VERSION FROM USER WHERE id = #{id}")
    TbUser getUserById(Long id);
}
