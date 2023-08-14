package com.it.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component//让spring控制
@Aspect//告诉spring，让其当做aop使用，不是bean使用
public class MyAdvice {
    //execution:执行
    @Pointcut("execution(void com.it.BookDao.update())")//执行到对应文件下的方法
    //定义一个切入点
    private void pt(){}



    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
