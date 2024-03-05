package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentInformation;

public interface StudentInformationRepository extends JpaRepository<StudentInformation,Integer>
{
    
}
