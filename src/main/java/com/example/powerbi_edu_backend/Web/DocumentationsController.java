package com.example.powerbi_edu_backend.Web;

import com.example.powerbi_edu_backend.Model.Entities.Documentations;
import com.example.powerbi_edu_backend.Service.DocumentationsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/documentations")
@CrossOrigin(value = "*")
public class DocumentationsController {
    private final DocumentationsService documentationsService;

    public DocumentationsController(DocumentationsService documentationsService) {
        this.documentationsService = documentationsService;
    }

    @GetMapping
    public List<Documentations> getAllDocumentations() {
        return this.documentationsService.findAll();
    }
}
