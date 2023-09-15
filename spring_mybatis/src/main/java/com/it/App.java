package com.it;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class App {

    public static void main(String[] args) {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resource.getResourceAsStream("SqlMapConfig.xml");
    }
}
