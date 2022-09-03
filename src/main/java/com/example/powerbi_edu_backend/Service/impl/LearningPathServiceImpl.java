package com.example.powerbi_edu_backend.Service.impl;

import com.example.powerbi_edu_backend.Model.Entities.LearningPath;
import com.example.powerbi_edu_backend.Repository.LearningPathRepository;
import com.example.powerbi_edu_backend.Service.LearningPathService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearningPathServiceImpl implements LearningPathService {
    private final LearningPathRepository learningPathRepository;

    public LearningPathServiceImpl(LearningPathRepository learningPathRepository) {
        this.learningPathRepository = learningPathRepository;
    }

    @Override
    public List<LearningPath> findAll() {
        return this.learningPathRepository.findAll();
    }
}
