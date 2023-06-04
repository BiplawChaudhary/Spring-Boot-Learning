package com.relationship.OneToOne.service;

import com.relationship.OneToOne.dto.request.AddressRequestDto;
import com.relationship.OneToOne.dto.response.AddressResponseDto;

import java.util.List;

public interface AddressService {
    AddressResponseDto saveAddress(AddressRequestDto addr);

    AddressResponseDto getById(Integer id);

    List<AddressResponseDto> getAll();
}
