package com.example.powerbi_edu_backend.Service.impl;

import com.example.powerbi_edu_backend.Model.Entities.Documentations;
import com.example.powerbi_edu_backend.Repository.DocumentationsRepository;
import com.example.powerbi_edu_backend.Service.DocumentationsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentationsServiceImpl implements DocumentationsService {
    private final DocumentationsRepository documentationsRepository;

    public DocumentationsServiceImpl(DocumentationsRepository documentationsRepository) {
        this.documentationsRepository = documentationsRepository;
    }

    @Override
    public List<Documentations> findAll() {
        return this.documentationsRepository.findAll();
    }
}
