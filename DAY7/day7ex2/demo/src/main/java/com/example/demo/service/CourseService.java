package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepo;

@Service
public class CourseService {
    public CourseRepo courseRepo;
    public CourseService(CourseRepo courseRepo)
    {
        this.courseRepo = courseRepo;
    }
    public boolean saveCourse(Course course)
    {
        try
        {
            courseRepo.save(course);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Course> getCourses()
    {
        return courseRepo.findAll();
    }
    public List<Course> getCourseByCourseName(String courseName)
    {
        return courseRepo.findByCourseName(courseName);
    }
}
