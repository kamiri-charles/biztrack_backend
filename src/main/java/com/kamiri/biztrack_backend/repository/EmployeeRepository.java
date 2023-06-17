package com.kamiri.biztrack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kamiri.biztrack_backend.models.Employee;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
    // Custom queries go here
    Employee findByUuid(UUID uuid);
}