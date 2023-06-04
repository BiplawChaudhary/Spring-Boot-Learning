package com.swagger.swaggerpractice.controller;

import com.swagger.swaggerpractice.dto.request.EmployeeRequestDto;
import com.swagger.swaggerpractice.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    @Operation(summary = "Save Employee to database", description = "Save employee")
    public ResponseEntity<?> saveToEmp(@RequestBody EmployeeRequestDto dto){
        try{
            return new ResponseEntity<>(employeeService.saveEmployee(dto), HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
