package com.example.powerbi_edu_backend.Service.impl;

import com.example.powerbi_edu_backend.Model.Entities.News;
import com.example.powerbi_edu_backend.Repository.NewsRepository;
import com.example.powerbi_edu_backend.Service.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    private final NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public List<News> findAll() {
        return this.newsRepository.findAll();
    }
}
