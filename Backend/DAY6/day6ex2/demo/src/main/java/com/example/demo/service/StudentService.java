package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
    private StudentRepo StudentRepo;
    public StudentService(StudentRepo StudentRepo){
        this.StudentRepo=StudentRepo;
    }
    public Student postStudent(Student student){
        return StudentRepo.save(student);
    }
    public List<Student> getStudent(String field){
        return StudentRepo.findAll(Sort.by(field));
    }
    public Page<Student> paginationChildren(int offset,int pagesize){
        return StudentRepo.findAll(PageRequest.of(offset,pagesize));
    }
    public Page<Student> pageSortChildren(int offset,int pagesize,String field){
        PageRequest pageRequest=PageRequest.of(offset, pagesize , Sort.by(field));
        return StudentRepo.findAll(pageRequest);
    }
    public Page<Student> getPaginationStudent(int offset, int pagesize) {
        throw new UnsupportedOperationException("Unimplemented method 'getPaginationStudent'");
    }
    public Page<Student> pageSortStudent(int offset, int pagesize, String field) {
        
        throw new UnsupportedOperationException("Unimplemented method 'pageSortStudent'");
    }
}
