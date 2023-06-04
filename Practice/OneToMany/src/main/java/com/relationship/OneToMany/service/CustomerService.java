package com.relationship.OneToMany.service;

import com.relationship.OneToMany.dto.request.CustomerRequestDto;
import com.relationship.OneToMany.dto.response.CustomerResponseDto;
import com.relationship.OneToMany.entity.Order;

import java.util.List;

public interface CustomerService {

    //Save the Customer
    CustomerResponseDto saveCustomer(CustomerRequestDto dto);

    //Get
    CustomerResponseDto getById(Integer id);

    List<CustomerResponseDto> getAllCustomer();

    //Delete
    String deleteById(Integer id);

    //Update
    void updateOrderList(Order order, Integer id);
}
