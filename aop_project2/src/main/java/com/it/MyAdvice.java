package com.it;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.it.BookDao.update())")
    private void pt(){};

    @Pointcut("execution(int com.it.BookDao.select())")
    private void pt2(){};

//    @Before("pt()")
    public void before(){
        System.out.println("before advice...");
    }

//    @After("pt()")
    public void after(){
        System.out.println("after advice...");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before..");
        //表示对原始操作的调用
        Object ret = pjp.proceed();
        //System.out.println(ret);
        System.out.println("around after..");
        return ret;
    }

    //有返回值的方法的aop
    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before..");
        //表示对原始操作的调用
        Object ret = pjp.proceed();
        System.out.println("around after..");
        return ret;
    }

    //afterReturning代表原始方法在成功运行以后实现下面的这个动作
    @AfterReturning("pt2()")
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    //afterThrowing代表抛出异常后运行
    @AfterThrowing("pt2()")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }
}
