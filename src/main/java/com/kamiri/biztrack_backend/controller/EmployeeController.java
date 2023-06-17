package com.kamiri.biztrack_backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kamiri.biztrack_backend.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.kamiri.biztrack_backend.models.Employee;
import java.util.UUID;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Get employee by UUID
    @GetMapping("/{uuid}")
    public Employee getEmployeeByUuid(@PathVariable("uuid") UUID uuid) {
        return employeeRepository.findByUuid(uuid);
    }
}