package com.it.dao.impl;

import org.springframework.stereotype.Component;

@Component("bookDao")
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("Book dao save...");
    }
}
