package com.biplaw.dbtest.dto.request;

public class StudentRequestDto {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentRequestDto(String name) {
        this.name = name;
    }
}
