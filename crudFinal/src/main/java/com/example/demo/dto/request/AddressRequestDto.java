package com.example.demo.dto.request;

public class AddressRequestDto {
    private String state;
    private String district;

    //Constructor
    public AddressRequestDto(){

    }

    public AddressRequestDto(String state, String district) {
        this.state = state;
        this.district = district;
    }

    //Geetters and Setters----------

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
