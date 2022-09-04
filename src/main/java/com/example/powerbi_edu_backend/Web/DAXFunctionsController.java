package com.example.powerbi_edu_backend.Web;


import com.example.powerbi_edu_backend.Model.Entities.DAXFunctions;
import com.example.powerbi_edu_backend.Service.DAXFunctionsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/DAXFunctions")
@CrossOrigin(value = "*")
public class DAXFunctionsController {
    private final DAXFunctionsService daxFunctionsService;

    public DAXFunctionsController(DAXFunctionsService daxFunctionsService) {
        this.daxFunctionsService = daxFunctionsService;
    }

    @GetMapping
    public List<DAXFunctions> getAllDAXFunctions() {
        return this.daxFunctionsService.findAll();
    }

//    @GetMapping("/categories")
//    public List<String> getAllDAXFunctionsCategories() {
//        return this.daxFunctionsService.findAllDAXFuncCategories();
//    }
}
