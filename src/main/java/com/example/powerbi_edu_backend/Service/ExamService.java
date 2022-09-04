package com.example.powerbi_edu_backend.Service;

import com.example.powerbi_edu_backend.Model.Entities.Exam;
import com.example.powerbi_edu_backend.Model.dto.AnswerQuestion;

import java.util.List;

public interface ExamService {

    List<Exam> findAll();

    Exam findById(Long id);

    Double submitAnswers(List<AnswerQuestion> answers);
}
