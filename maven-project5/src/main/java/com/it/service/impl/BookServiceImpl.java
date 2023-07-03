package com.it.service.impl;

import com.it.dao.impl.BookDao;
import org.springframework.stereotype.Component;

@Component

public class BookServiceImpl implements BookService{

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    @Override
    public void save() {
        System.out.println("Book service save...");
        bookDao.save();
    }
}
