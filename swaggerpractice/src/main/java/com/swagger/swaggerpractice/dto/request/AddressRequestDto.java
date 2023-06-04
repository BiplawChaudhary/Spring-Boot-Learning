package com.swagger.swaggerpractice.dto.request;

import javax.persistence.Column;

public class AddressRequestDto {
    private String district;

    private Integer state;

    //Getters and Setters

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    //Constructor

    public AddressRequestDto(){

    }
    public AddressRequestDto(String district, Integer state) {
        this.district = district;
        this.state = state;
    }
}
