package com.example.powerbi_edu_backend.Model.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class LearningPath {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;


    @OneToMany
    @JoinColumn(nullable = true)
    private List<Course> courses;

    public LearningPath(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public LearningPath() {
    }
}
