package com.example.powerbi_edu_backend.Model.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Documentations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;

    private String service;

    @ElementCollection
    private List<String> articles;

    public Documentations() {
    }

    public Documentations(String title, String service, List<String> articles) {
        this.title = title;
        this.service = service;
        this.articles = articles;
    }
}
