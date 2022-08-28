package com.example.powerbi_edu_backend.Service;

import com.example.powerbi_edu_backend.Model.Entities.News;

import java.util.List;

public interface NewsService {

    List<News> findAll();

}
