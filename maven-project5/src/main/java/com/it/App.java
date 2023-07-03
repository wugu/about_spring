package com.it;

import com.it.dao.impl.BookDao;
import com.it.service.impl.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        BookService bookService = ctx.getBean(BookService.class);
//
//        System.out.println(bookDao);
//        System.out.println(bookService);
    }

}
