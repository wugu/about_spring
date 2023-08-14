package com.it;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.it")
@EnableAspectJAutoProxy//告诉spring,有用注解的aop
public class SpringConfig {
}
