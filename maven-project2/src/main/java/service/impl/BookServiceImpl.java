package service.impl;

import com.it.dao.impl.BookDao;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save....");
        bookDao.save();
    }

}
