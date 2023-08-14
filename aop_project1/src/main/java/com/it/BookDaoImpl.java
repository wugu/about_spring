package com.it;

import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{

    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("bookDao save...");
    }

    @Override
    public void update() {
        System.out.println("bookDao update....");
    }
}
