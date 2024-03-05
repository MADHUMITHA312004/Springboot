package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.model.StudentInformation;
import com.example.demo.repository.StudentInformationRepository;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentInformationRepository studentInformationRepository;
    
    public Student post(Student student)
    {
        return studentRepository.save(student);
    }
    public StudentInformation post(StudentInformation studentInformation)
    {
        return studentInformationRepository.save(studentInformation);
    }
    public List<Student> getStudent()
    {
        return studentRepository.findAll();
    }
}