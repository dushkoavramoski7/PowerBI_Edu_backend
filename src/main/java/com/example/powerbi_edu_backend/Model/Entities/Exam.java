package com.example.powerbi_edu_backend.Model.Entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Entity
@Getter
@Setter
public class Exam {
    private static final String DATE_FORMATTER= "yyyy-MM-dd";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    private String service;

    private Double rating;

    private String timeToComplete;

    private LocalDateTime dataCreated;

    private Integer studentsTakenExam;

    @Column(columnDefinition = "LONGTEXT")
    private String shortDescription;

    @Column(columnDefinition = "LONGTEXT")
    private String aboutExam;

    @ElementCollection
    private List<String> tips;

    private String level;

    private String examFor;

    @OneToMany
    private List<Question> questions;


    public String getFormattedDateCreated() {
        return DateTimeFormatter.ofPattern(DATE_FORMATTER).format(this.dataCreated) + ", "+ this.dataCreated.getDayOfWeek();
    }

    public Exam(String name, String service, Double rating, String timeToComplete, LocalDateTime dataCreated, Integer studentsTakenExam, String shortDescription, String aboutExam, List<String> tips, String level, String examFor, List<Question> questions) {
        this.name = name;
        this.service = service;
        this.rating = rating;
        this.timeToComplete = timeToComplete;
        this.dataCreated = dataCreated;
        this.studentsTakenExam = studentsTakenExam;
        this.shortDescription = shortDescription;
        this.aboutExam = aboutExam;
        this.tips = tips;
        this.level = level;
        this.examFor = examFor;
        this.questions = questions;
    }

    public Exam() {
    }
}
