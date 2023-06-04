package com.example.demo.dto.response;

import com.example.demo.dto.request.StudentRequestDto;
import com.example.demo.entity.Student;

public class StudentResponseDto {
    private Integer id;
    private String name;

    //Constructor
    public StudentResponseDto(){

    }

    public StudentResponseDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentResponseDto(String name) {
        this.name = name;
    }
    public StudentResponseDto(Student std){

        this.id = std.getId();
        this.name = std.getName();
    }

    //Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
