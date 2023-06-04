package com.swagger.swaggerpractice.service;

import com.swagger.swaggerpractice.dto.request.EmployeeRequestDto;
import com.swagger.swaggerpractice.dto.response.EmployeeResponseDto;

public interface EmployeeService {
    EmployeeResponseDto saveEmployee(EmployeeRequestDto emp);
}
