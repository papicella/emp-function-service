package com.example.empfunctionservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface EmpRepo extends JpaRepository <Employee, Long> {

    @RestResource(path = "customerName", rel = "customerName")
    List<Employee> findByNameIgnoreCase(@Param("q") String name);
}
