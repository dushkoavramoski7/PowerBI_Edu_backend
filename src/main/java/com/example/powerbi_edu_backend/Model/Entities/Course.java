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
public class Course {
    private static final String DATE_FORMATTER= "yyyy-MM-dd";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    private String service;

    @ElementCollection
    private List<String> categories;

    private Double rating;

    private String timeToComplete;

    private LocalDateTime dataCreated;

    private Integer studentsEnrolled;

    @Column(columnDefinition = "LONGTEXT")
    private String aboutCourse;

    private String level;

    private String courseFor;

    private String canTakeExam;

    @ElementCollection
    private List<String> topics;

    @Column(columnDefinition = "LONGTEXT")
    private String longDescription;

    @Column(columnDefinition = "LONGTEXT")
    private String prerequisites;

    public String getFormattedDateCreated() {
        return DateTimeFormatter.ofPattern(DATE_FORMATTER).format(this.dataCreated) + ", "+ this.dataCreated.getDayOfWeek();
    }

    public Course(String name, String service, List<String> categories, Double rating, String timeToComplete, LocalDateTime dataCreated, Integer studentsEnrolled, String aboutCourse, String level, String courseFor, String canTakeExam, List<String> topics, String longDescription, String prerequisites) {
        this.name = name;
        this.service = service;
        this.categories = categories;
        this.rating = rating;
        this.timeToComplete = timeToComplete;
        this.dataCreated = dataCreated;
        this.studentsEnrolled = studentsEnrolled;
        this.aboutCourse = aboutCourse;
        this.level = level;
        this.courseFor = courseFor;
        this.canTakeExam = canTakeExam;
        this.topics = topics;
        this.longDescription = longDescription;
        this.prerequisites = prerequisites;
    }

    public Course() {
    }
}
