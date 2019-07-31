package com.qf.demo.controller;

import com.qf.demo.entity.Book;
import com.qf.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author py
 * @Date 2019/7/30
 */
@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private IBookService bookService;
    @RequestMapping("getbook/{id}")
    public Book getBook(@PathVariable("id") Integer id){
        Book book=bookService.getBook(id);
        return book;
    }
    @RequestMapping("addbook")
    public String addBook(@Valid Book book){
        System.out.println(book.toString());
        return "ok";
    }
}
