package com.example.powerbi_edu_backend.Repository;

import com.example.powerbi_edu_backend.Model.Entities.DAXFunctions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAXFunctionsRepository extends JpaRepository<DAXFunctions, Long> {
}
