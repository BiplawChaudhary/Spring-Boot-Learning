package com.relationship.OneToMany.service.impl;

import com.relationship.OneToMany.dto.request.CustomerRequestDto;
import com.relationship.OneToMany.dto.response.CustomerResponseDto;
import com.relationship.OneToMany.entity.Customer;
import com.relationship.OneToMany.entity.Order;
import com.relationship.OneToMany.repo.CustomerRepo;
import com.relationship.OneToMany.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    //Save
    @Override
    public CustomerResponseDto saveCustomer(CustomerRequestDto dto) {
        Customer newCustomer = new Customer();

        newCustomer.setName(dto.getName());

        Customer savedCustomer = customerRepo.save(newCustomer);
        return new CustomerResponseDto(savedCustomer);
    }

    @Override
    public CustomerResponseDto getById(Integer id) {
        return new CustomerResponseDto(customerRepo.findById(id).get());
    }

    @Override
    public List<CustomerResponseDto> getAllCustomer() {
        List<CustomerResponseDto> returnList = new ArrayList<>();

        List<Customer> allData;

        allData = customerRepo.findAll();

        for(Customer each: allData){
            returnList.add(new CustomerResponseDto(each));
        }

        return returnList;
    }

    @Override
    public String deleteById(Integer id) {
        customerRepo.deleteById(id);
        return "Id " + id + " Deleted.";
    }

    //Updata

    @Override
    public void updateOrderList(Order order, Integer id) {
        Customer foundCOustomer = customerRepo.findById(id).get();

        List<Order> newORder = foundCOustomer.getOrder();
        newORder.add(order);

        foundCOustomer.setOrder(newORder);

        Customer savedCustomer = customerRepo.save(foundCOustomer);
    }
}
