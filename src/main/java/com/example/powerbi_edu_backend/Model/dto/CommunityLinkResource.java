package com.example.powerbi_edu_backend.Model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommunityLinkResource {
    private String name;

    private String description;

    private String url;
}
