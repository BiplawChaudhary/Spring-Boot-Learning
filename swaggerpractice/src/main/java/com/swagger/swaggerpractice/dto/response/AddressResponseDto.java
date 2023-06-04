package com.swagger.swaggerpractice.dto.response;

import com.swagger.swaggerpractice.entity.Address;

public class AddressResponseDto {
    private  Integer id;
    private String district;

    private Integer state;

    //Constructor
    public AddressResponseDto(){

    }
    public AddressResponseDto(Integer id, String district, Integer state) {
        this.id = id;
        this.district = district;
        this.state = state;
    }
    public AddressResponseDto(Address addr){
        this.id = addr.getId();
        this.district = addr.getDistrict();
        this.state = addr.getState();
    }

    //Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
}
