package com.example.demo.service.impl;

import com.example.demo.dto.request.AddressRequestDto;
import com.example.demo.dto.response.AddressResponseDto;
import com.example.demo.entity.Address;
import com.example.demo.repo.AddressRepo;
import com.example.demo.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    public final AddressRepo addressRepo;

    public AddressServiceImpl(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }


    @Override
    public AddressResponseDto saveAddress(AddressRequestDto addr) {
        Address newAddress = new Address();

        newAddress.setState(addr.getState());
        newAddress.setDistrict(addr.getDistrict());

        Address savedAddress = addressRepo.save(newAddress);

//        AddressResponseDto returnData = new AddressResponseDto(savedAddress);

        return new AddressResponseDto(savedAddress);
    }

    //Method to return all the addresses saved to the database


    //Implements the find the id method
    @Override
    public AddressResponseDto getByUniqueId(Integer id) {
//        SELECT * from address where id=id;
        Address searchedAddress = addressRepo.findById(id).get();

        if(searchedAddress == null){
            System.out.println("Id not present");
        }
        AddressResponseDto returnData = new AddressResponseDto(searchedAddress);
        return returnData;
    }

    //Read all values
    @Override
    public List<AddressResponseDto> getAllValues() {
        //Return garney list
        //Database bata j j aauxa sabai yo list ma rakhaney ani pathaune user lai
        List<AddressResponseDto> returnList = new ArrayList<>();

        //Seelect * from address;
        List<Address> queryResult = addressRepo.findAll();

        for(Address each : queryResult){
            AddressResponseDto result = new AddressResponseDto(each);
            returnList.add(result);
        }
        return returnList;
    }

    //String--> The id you entered {id} has been deleted. --->Service
//    .deleteById(id); -->PathVariable

    //Method to delete the value by Id

    @Override
    public String deleteByUniqueId(Integer id) {
        addressRepo.deleteById(id);
        return "The id" + id + " has been deleted.";
    }

    //To update the value in table

    @Override
    public AddressResponseDto updateValue(Integer id, AddressRequestDto data) {
        Address searchAddress = addressRepo.findById(id).get();

        searchAddress.setDistrict(data.getDistrict());
        searchAddress.setState(data.getState());

        Address savedAddress = addressRepo.save(searchAddress);
        return new AddressResponseDto(savedAddress);
    }
}
