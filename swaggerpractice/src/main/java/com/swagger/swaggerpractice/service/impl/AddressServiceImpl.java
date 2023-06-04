package com.swagger.swaggerpractice.service.impl;

import com.swagger.swaggerpractice.dto.request.AddressRequestDto;
import com.swagger.swaggerpractice.dto.response.AddressResponseDto;
import com.swagger.swaggerpractice.entity.Address;
import com.swagger.swaggerpractice.repo.AddressRepo;
import com.swagger.swaggerpractice.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;

    public AddressServiceImpl(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @Override
    public AddressResponseDto saveAddress(AddressRequestDto addr) {
        Address newAddress = new Address();

        newAddress.setDistrict(addr.getDistrict());
        newAddress.setState(addr.getState());

        Address savedAddress = addressRepo.save(newAddress);

        return new AddressResponseDto(savedAddress);
    }
}
