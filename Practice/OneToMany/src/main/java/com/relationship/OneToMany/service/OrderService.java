package com.relationship.OneToMany.service;


import com.relationship.OneToMany.dto.request.OrderRequestDto;
import com.relationship.OneToMany.dto.response.OrderResponseDto;

import java.util.List;

public interface OrderService {
        //Save
    OrderResponseDto saveOrder(OrderRequestDto dto);

    //Get
    OrderResponseDto getByUniqueId(Integer id);

    List<OrderResponseDto> getAllData();

    //Delete
    String deleteOrderById(Integer id);


}
