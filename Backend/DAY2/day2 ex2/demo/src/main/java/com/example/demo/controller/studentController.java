package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class studentController {
    @Autowired
    public student s;
    @RequestMapping("/path")
    public String requestMethodName()
     {
        return s.getName()+s.getAge();
    }
    
}
