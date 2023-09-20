package com.it.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
//@ComponentScan({"com.it.service","com.it.dao"})第一种，spring扫描自己需要的bean，不扫SpringMVC需要的bean
//@ComponentScan(value = "com.it",
//        excludeFilters = @ComponentScan.Filter(
//                type = FilterType.ANNOTATION,classes = Controller.class
//        )
//)第二种，扫描全部，排除controller类的bean，即排除SpringMVC的bean，特别注意如果有多个@Configuration，一个扫描能扫描到其他有Configuration的bean
public class SpringConfig {
}
