package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.model.StudentInformation;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/student")
    public Student create(@RequestBody Student student)
    {
        return studentService.post(student);
    }
                  
    @PostMapping("/infostudent")
    public StudentInformation create(@RequestBody StudentInformation studentInformation)
    {
        return studentService.post(studentInformation);
    }
    
    @GetMapping("/students")
    public List<Student> getStudent()
    {
        return studentService.getStudent();
    }
    

    
}
