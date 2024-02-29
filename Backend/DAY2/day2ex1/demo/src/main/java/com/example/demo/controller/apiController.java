package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.appConfig;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
public class apiController {
    @Autowired
    public appConfig ap;
    @RequestMapping("/app")
    public String requestMethodName() 
    {
        return ap.getAppNmae()+" "+ap.getAppVersion();
    }
    

}
