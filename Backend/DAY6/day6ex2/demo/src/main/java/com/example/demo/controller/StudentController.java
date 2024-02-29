package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class StudentController{
    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }
    @PostMapping("/api/student")
    public ResponseEntity<Student> postStudentDetails(@RequestBody Student student) {
        if(student!=null){
            return new ResponseEntity<>(student,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(student,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/student/sortBy/{field}")
    public ResponseEntity<List<Student>> getListOfStudent(@PathVariable("field") String field) {
        List<Student> list=studentService.getStudent(field);
        if(list!=null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
        return new ResponseEntity<>(list,HttpStatus.NOT_FOUND);
    }
    @GetMapping("/api/student/{offset}/{pagesize}")
    public ResponseEntity<Page<Student>> getPaginationStudent(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize) {
        Page<Student> student=studentService.getPaginationStudent(offset,pagesize);
        if(student!=null){
            return new ResponseEntity<>(student,HttpStatus.OK);
        }
        return new ResponseEntity<>(student,HttpStatus.NOT_FOUND);
    }
    @GetMapping("/api/student/{offset}/{pagesize}/{field}")
    public ResponseEntity<Page<Student>> getpageSortStudent(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize,@PathVariable("field") String field) {
        Page<Student> sort=studentService.pageSortStudent(offset,pagesize,field);
        if(sort!=null){
            return new ResponseEntity<>(sort,HttpStatus.OK);
        }
        return new ResponseEntity<>(sort,HttpStatus.NOT_FOUND);
    }
    
    
    
}