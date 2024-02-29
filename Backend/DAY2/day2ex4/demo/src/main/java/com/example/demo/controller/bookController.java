package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.book.book;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class bookController {
    @GetMapping("/book")
    public book getMethodName() {
        book s =new book("It ends with you","madhu",new Date());
        return s;
    }
    
    
}
