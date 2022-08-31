package com.example.powerbi_edu_backend.Model.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.Lob;

@Entity
@Getter
@Setter
public class CommunityDocuments {
    private static final String DATE_FORMATTER= "yyyy-MM-dd";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String fileName;

    private String contentType;

    private Long size;

    private String description;

    @Lob
    private byte[] content;

    private LocalDateTime uploadedTime;

    private Boolean shared;


    public CommunityDocuments(String fileName, String contentType, Long size, String description, byte[] content, LocalDateTime uploadedTime, Boolean shared) {
        this.fileName = fileName;
        this.contentType = contentType;
        this.size = size;
        this.description = description;
        this.content = content;
        this.uploadedTime = uploadedTime;
        this.shared = shared;
    }

    public CommunityDocuments() {
    }

    public String getFormattedDateUpload() {
        return "Uploaded: " + DateTimeFormatter.ofPattern(DATE_FORMATTER).format(this.uploadedTime) + ", "+ this.uploadedTime.getDayOfWeek();
    }
}
