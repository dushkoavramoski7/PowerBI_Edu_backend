package com.example.powerbi_edu_backend.Service.impl;

import com.example.powerbi_edu_backend.Model.Entities.Course;
import com.example.powerbi_edu_backend.Repository.CourseRepository;
import com.example.powerbi_edu_backend.Service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> findAll() {
        return this.courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return this.courseRepository.findById(id).get();
    }
}
