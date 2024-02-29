package com.day2.ex3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.day2.ex3.model.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class studentController {
   @GetMapping("/ignore")
   public student gStudent() {
       student s=new student("101","madhu","i am cute");
       return s;
   }
    
}
