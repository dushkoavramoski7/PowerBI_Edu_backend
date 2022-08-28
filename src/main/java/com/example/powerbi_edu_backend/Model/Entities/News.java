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
public class News {
    private static final String DATE_FORMATTER= "yyyy-MM-dd";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;

    private String service;

    private LocalDateTime datePublished;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    @ElementCollection
    private List<String> categories;

    private String link;

    public News() {

    }

    public String getFormattedDatePublished() {
        return "Published: " + DateTimeFormatter.ofPattern(DATE_FORMATTER).format(this.datePublished) + ", "+ this.datePublished.getDayOfWeek();
    }

    public News(String title, String service, LocalDateTime datePublished, String description, List<String> categories, String link) {
        this.title = title;
        this.service = service;
        this.datePublished = datePublished;
        this.description = description;
        this.categories = categories;
        this.link = link;
    }
}
