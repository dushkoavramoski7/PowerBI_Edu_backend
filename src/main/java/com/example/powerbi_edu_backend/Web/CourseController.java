package com.example.powerbi_edu_backend.Web;


import com.example.powerbi_edu_backend.Model.Entities.Course;
import com.example.powerbi_edu_backend.Model.Entities.Exam;
import com.example.powerbi_edu_backend.Service.CourseService;
import com.example.powerbi_edu_backend.Service.ExamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(value = "*")
public class CourseController {
    private final CourseService courseService;
    private final ExamService examService;


    public CourseController(CourseService courseService, ExamService examService) {
        this.courseService = courseService;
        this.examService = examService;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return this.courseService.findAll();
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Long id) {
        return this.courseService.findById(id);
    }

    @GetMapping("/exams")
    public List<Exam> getAllExams() {
        return this.examService.findAll();
    }

    @GetMapping("/exams/{id}")
    public Exam getExam(@PathVariable Long id) {
        return this.examService.findById(id);
    }
}
