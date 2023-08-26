package com.it;

import com.it.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest//springboot整合单元测试的注解
class SpringbootMybatisQuickstartApplicationTests {

    @Autowired
    public UserMapper userMapper;

    @Test
    public void textUser() {
        List<User> userList = userMapper.list();
        userList.stream().forEach(user -> {
            System.out.println(user);
        });
    }

}
