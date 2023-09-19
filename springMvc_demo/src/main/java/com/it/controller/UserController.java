package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//使用Controller来控制bean
public class UserController {

    //设置当前操作的访问路径
    @RequestMapping("/save")
    //设置当前操作的返回类型（返回的整体作为响应内容
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':'springmvc'}";
    }
}
