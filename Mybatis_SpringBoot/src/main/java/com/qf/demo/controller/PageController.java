package com.qf.demo.controller;

import com.qf.demo.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author py
 * @Date 2019/7/30
 */
@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("hello")
    public String hello(Model model) {
        //int i=1/0;
        Integer ad = 80;
        Integer age = 15;
        model.addAttribute("ad", ad);
        model.addAttribute("age", age);
        List<Book> bookList=new ArrayList<>();
       bookList.add(new Book(1,"你好",20.0,1));
        bookList.add(new Book(2,"你好a",22.0,2));
        model.addAttribute("booklist",bookList);

        model.addAttribute("now",new Date());
        return "hello";
    }
}
