package com.example.powerbi_edu_backend.Service;


import com.example.powerbi_edu_backend.Model.Entities.LearningPath;

import java.util.List;

public interface LearningPathService {
    List<LearningPath> findAll();
}
