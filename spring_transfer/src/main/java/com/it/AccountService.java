package com.it;


import org.springframework.transaction.annotation.Transactional;

//out 传出方
//in 传入方
//money 金额
@Transactional
public interface AccountService {
    public void transfer(String out,String in,Double money);
}
