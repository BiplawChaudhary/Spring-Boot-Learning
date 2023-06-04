package com.biplaw.dbtest.service;

import com.biplaw.dbtest.dto.request.AddressRequestDto;
import com.biplaw.dbtest.dto.response.AddressResponseDto;

public interface AddressService {
    AddressResponseDto saveAddress(AddressRequestDto addressRequestDto);

    //Request --> state, district
}
