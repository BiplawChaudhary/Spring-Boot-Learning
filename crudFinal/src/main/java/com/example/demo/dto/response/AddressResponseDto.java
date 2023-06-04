package com.example.demo.dto.response;

import com.example.demo.entity.Address;

public class AddressResponseDto {
    private Integer id;
    private String state;
    private String district;

    //Constructor
    public AddressResponseDto(){

    }
    public AddressResponseDto(Integer id, String state, String district) {
        this.id = id;
        this.state = state;
        this.district = district;
    }
    public AddressResponseDto(Address addr){
        this.id = addr.getId();
        this.state = addr.getState();
        this.district = addr.getDistrict();
    }

    //Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
