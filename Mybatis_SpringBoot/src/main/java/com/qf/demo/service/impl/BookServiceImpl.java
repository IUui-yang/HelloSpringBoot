package com.qf.demo.service.impl;

import com.qf.demo.entity.Book;
import com.qf.demo.mapper.BookMapper;
import com.qf.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author py
 * @Date 2019/7/30
 */
@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Book getBook(Integer id) {
        return bookMapper.getBook(id);
    }
}
