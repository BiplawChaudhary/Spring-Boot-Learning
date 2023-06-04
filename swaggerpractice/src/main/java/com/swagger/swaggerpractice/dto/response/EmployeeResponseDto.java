package com.swagger.swaggerpractice.dto.response;

import com.swagger.swaggerpractice.entity.Employee;

public class EmployeeResponseDto {
    private Integer id;
    private String name;
    private Integer salary;

    //Constructor
    public EmployeeResponseDto(){

    }

    public EmployeeResponseDto(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public EmployeeResponseDto(Employee emp){
        this.id = emp.getId();
        this.salary = emp.getSalary();
        this.name = emp.getName();
    }
}
