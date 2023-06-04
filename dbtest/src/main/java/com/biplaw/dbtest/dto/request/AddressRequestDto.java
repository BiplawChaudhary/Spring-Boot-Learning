package com.biplaw.dbtest.dto.request;

public class AddressRequestDto {
    private String state;
    private String district;

    //Getters

    public String getState() {
        return state;
    }

    public String getDistrict() {
        return district;
    }


    //Setters

    public void setState(String state) {
        this.state = state;
    }

    public void setDistrict(String district) {
        this.district = district;
    }


    //Constructor
    public AddressRequestDto(){

    }

    public AddressRequestDto(String state, String district) {
        this.state = state;
        this.district = district;
    }
}
