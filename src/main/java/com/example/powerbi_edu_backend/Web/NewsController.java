package com.example.powerbi_edu_backend.Web;

import com.example.powerbi_edu_backend.Model.Entities.News;
import com.example.powerbi_edu_backend.Service.NewsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/news")
@CrossOrigin(value = "*")
public class NewsController {
    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public List<News> getAllNews() {
        return this.newsService.findAll();
    }
}
