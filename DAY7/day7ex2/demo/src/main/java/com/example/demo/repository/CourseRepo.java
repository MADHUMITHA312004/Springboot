package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Course;

public interface CourseRepo extends JpaRepository<Course,Integer>
{
    List<Course> findByCourseName(String courseName);
}
