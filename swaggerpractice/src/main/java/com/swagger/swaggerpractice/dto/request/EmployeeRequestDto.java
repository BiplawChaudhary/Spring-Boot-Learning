package com.swagger.swaggerpractice.dto.request;

public class EmployeeRequestDto {

    private String name;
    private Integer salary;
    private Integer address_id;

    //Constuctor
    public EmployeeRequestDto(){

    }

    public EmployeeRequestDto(String name, Integer salary, Integer address_id) {
        this.name = name;
        this.salary = salary;
        this.address_id = address_id;
    }

    //getters and settes

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
