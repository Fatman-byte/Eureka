package com.qianfeng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * author:刘强
 * date:2019/9/1919:15
 * description:实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbUser {
    public Long id;
    public String name;
    public Date birth;
    public Integer salary;
    public Integer version;
}
