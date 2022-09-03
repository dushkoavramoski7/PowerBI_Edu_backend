package com.example.powerbi_edu_backend.Service;

import com.example.powerbi_edu_backend.Model.Entities.Course;

import java.util.List;

public interface CourseService{

    List<Course> findAll();

    Course findById(Long id);

}
