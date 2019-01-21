package com.example.empfunctionservice;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private EmpRepo empRepo;

    public EmployeeService(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }

    public String getEmployee (String employeeId) {
        Optional<Employee> emp = empRepo.findById(new Long(employeeId));
        Employee employee = emp.get();

        return employee.toString();
    }
}
