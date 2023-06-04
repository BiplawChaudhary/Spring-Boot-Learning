package com.biplaw.dbtest.dto.response;

import com.biplaw.dbtest.entity.Student;

public class StudentResponseDto {
    private Integer id;
    private String name;

    //--Getters

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //---Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Construcor

    public StudentResponseDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public  StudentResponseDto(Student savedStudent){
        this.id=savedStudent.getId();
        this.name = savedStudent.getName();
    }
}
