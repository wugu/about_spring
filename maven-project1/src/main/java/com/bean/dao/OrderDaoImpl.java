package com.bean.dao;

import com.bean.dao.OrderDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//引用接口InitializingBean，就可以不用在bea中采用init-method属性和destroy-method属性
public class OrderDaoImpl implements OrderDao, InitializingBean, DisposableBean {
    public void save(){
        System.out.println("order dao save ......");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy... ");
    }
}
