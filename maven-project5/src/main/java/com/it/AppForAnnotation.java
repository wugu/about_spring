package com.it;

import com.it.confiig.SpringConfig;
import com.it.dao.impl.BookDao;
import com.it.service.impl.BookService;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//    BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
    }

}
