package com.example.empfunctionservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@Slf4j
@SpringBootApplication
public class EmpFunctionServiceApplication {

    private static EmployeeService employeeService;

    public EmpFunctionServiceApplication(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Bean
    public Function<String, String> findEmployee() {
        return id -> {
            String response = employeeService.getEmployee(id);

            return response;
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(EmpFunctionServiceApplication.class, args);
    }

}

