package com.example.powerbi_edu_backend.Service.impl;

import com.example.powerbi_edu_backend.Model.Entities.Exam;
import com.example.powerbi_edu_backend.Repository.ExamRepository;
import com.example.powerbi_edu_backend.Service.ExamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {
    private final ExamRepository examRepository;

    public ExamServiceImpl(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }


    @Override
    public List<Exam> findAll() {
        return this.examRepository.findAll();
    }

    @Override
    public Exam findById(Long id) {
        return this.examRepository.findById(id).get();
    }
}
