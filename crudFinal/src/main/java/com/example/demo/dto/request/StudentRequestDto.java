package com.example.demo.dto.request;

public class StudentRequestDto {
    private String name;

    //Consturctor
    public StudentRequestDto(){

    }
    public StudentRequestDto(String name) {
        this.name = name;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
