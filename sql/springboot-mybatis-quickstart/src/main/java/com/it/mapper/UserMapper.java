package com.it.mapper;

import com.it.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper//在运行时，会自动生成该接口的实现类对象(动态代理中的代理对象)，并且将该对象交给IOC容器管理
public interface UserMapper {
    //查询全部的用户信息
    @Select("select * from db01")
    public List<User> list();
}
