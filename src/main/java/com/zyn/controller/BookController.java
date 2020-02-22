package com.zyn.controller;

import com.zyn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhaoyanan
 * @create 2020-02-20-12:23
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void printService(){
        System.out.println(bookService);
    }
}
