package com.example.demo.service;

import com.example.demo.dto.request.AddressRequestDto;
import com.example.demo.dto.response.AddressResponseDto;

import java.util.List;

public interface AddressService {

    AddressResponseDto saveAddress(AddressRequestDto addr);


    //Get address by unique id entered by the user
    AddressResponseDto getByUniqueId(Integer id);

    //Read all values from table
//    Address ---> AddressResponseDto
    //List
    List<AddressResponseDto> getAllValues();

    //Delete by id
    String deleteByUniqueId(Integer id);

    //Update the data in the table
    AddressResponseDto updateValue(Integer id, AddressRequestDto data);



}
