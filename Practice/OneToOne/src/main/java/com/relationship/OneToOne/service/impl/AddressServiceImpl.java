package com.relationship.OneToOne.service.impl;

import com.relationship.OneToOne.dto.request.AddressRequestDto;
import com.relationship.OneToOne.dto.response.AddressResponseDto;
import com.relationship.OneToOne.entity.Address;
import com.relationship.OneToOne.repo.AddressRepo;
import com.relationship.OneToOne.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepo addressRepo;

    @Override
    public AddressResponseDto saveAddress(AddressRequestDto addr) {
        Address addNew = new Address();

        addNew.setState(addr.getState());
        addNew.setDistrict(addr.getDistrict());

        Address savedAddress = addressRepo.save(addNew);

        return new AddressResponseDto(savedAddress);
    }

    @Override
    public AddressResponseDto getById(Integer id) {
        Address foundStudent = addressRepo.findById(id).get();

        return new AddressResponseDto(foundStudent);

    }

    @Override
    public List<AddressResponseDto> getAll() {
        List<AddressResponseDto> returnList  = new ArrayList<>();

        List<Address> allData = addressRepo.findAll();

        for(Address each: allData){
            returnList.add(new AddressResponseDto(each));
        }
        return returnList;
    }

    //To save the data




}
