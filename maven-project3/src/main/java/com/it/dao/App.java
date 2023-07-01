package com.it.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);

    }
}
