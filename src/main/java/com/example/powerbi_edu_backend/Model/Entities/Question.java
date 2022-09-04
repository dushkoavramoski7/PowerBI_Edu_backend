package com.example.powerbi_edu_backend.Model.Entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(columnDefinition = "LONGTEXT")
    private String text;

    @ElementCollection
    private List<String> answers;

    private Integer correctAnswer;

    public Question(String text, List<String> answers, Integer correctAnswer) {
        this.text = text;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public Question() {
    }
}
