package com.example.powerbi_edu_backend.Web;


import com.example.powerbi_edu_backend.Model.Entities.Exam;
import com.example.powerbi_edu_backend.Service.ExamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exams")
@CrossOrigin(value = "*")
public class ExamController {
    private final ExamService examService;

    public ExamController(ExamService examService) {
        this.examService = examService;
    }

    @GetMapping
    public List<Exam> getAllExams() {
        return this.examService.findAll();
    }

    @GetMapping("/{id}")
    public Exam getExam(@PathVariable Long id) {
        return this.examService.findById(id);
    }
}
