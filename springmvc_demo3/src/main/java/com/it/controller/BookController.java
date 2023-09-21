package com.it.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/book")放在上面映射路径
public class BookController {
//    @RequestMapping("/book/save")上面有映射路径后,这里不需要/book

    @ResponseBody
    public String save(){
        System.out.println("book save ...");
        return "book save ..return";
    }
}
