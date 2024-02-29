package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Person;

public interface PersonRepo extends JpaRepository<Person,Integer>
{
    List<Person> findByAge(int age);
}
