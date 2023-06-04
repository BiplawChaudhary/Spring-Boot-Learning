package com.swagger.swaggerpractice.service;

import com.swagger.swaggerpractice.dto.request.AddressRequestDto;
import com.swagger.swaggerpractice.dto.response.AddressResponseDto;

public interface AddressService {

    AddressResponseDto saveAddress(AddressRequestDto addr);
}
