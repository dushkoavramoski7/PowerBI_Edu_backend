package com.example.powerbi_edu_backend.Service;

import com.example.powerbi_edu_backend.Model.Entities.DAXFunctions;

import java.util.List;

public interface DAXFunctionsService {

    List<DAXFunctions> findAll();

    List<String> findAllDAXFuncCategories();
}
