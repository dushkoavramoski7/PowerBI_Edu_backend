package com.example.powerbi_edu_backend.Web;

import com.example.powerbi_edu_backend.Model.Entities.LearningPath;
import com.example.powerbi_edu_backend.Service.LearningPathService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/learningPath")
@CrossOrigin(value = "*")
public class LearningPathController {
    private final LearningPathService learningPathService;

    public LearningPathController(LearningPathService learningPathService) {
        this.learningPathService = learningPathService;
    }

    @GetMapping
    public List<LearningPath> getAllLearningPaths() {
        return this.learningPathService.findAll();
    }
}
