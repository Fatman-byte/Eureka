package com.qianfeng.mapper;

import com.qianfeng.pojo.TbUser;
import org.apache.ibatis.annotations.Select;

/**
 * author:刘强
 * date:2019/9/1919:20
 * description:SQL语句的实现
 */

public interface UserMapper {
//    DAO使用mapper作为包，sql语句使用注解方式：@Select @insert @update等（没有删除操作，只是修改状态）
    @Select("SELECT id,NAME,birth,salary,VERSION FROM USER WHERE id = #{id}")
    TbUser getUserById(Long id);
}
