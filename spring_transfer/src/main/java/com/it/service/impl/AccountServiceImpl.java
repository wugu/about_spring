package com.it.service.impl;

import com.it.AccountService;
import com.it.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out,money);
        accountDao.inMoney(in,money);
    }
}
