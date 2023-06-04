package com.biplaw.dbtest.dto.response;

import com.biplaw.dbtest.dto.request.AddressRequestDto;
import com.biplaw.dbtest.entity.Address;

public class AddressResponseDto {
    private Integer id;

    private String state;
    private  String district;

    //Getters
    public Integer getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public String getDistrict() {
        return district;
    }


    //Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDistrict(String district) {
        this.district = district;
    }


    //Constructors
    public AddressResponseDto(Address address){
        this.id = address.getId();
        this.state = address.getState();
        this.district = address.getState();
    }

    public AddressResponseDto(Integer id, String state, String district) {
        this.id = id;
        this.state = state;
        this.district = district;
    }
}
