package com.swagger.swaggerpractice.repo;

import com.swagger.swaggerpractice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
