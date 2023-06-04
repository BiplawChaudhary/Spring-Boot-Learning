package com.relationship.OneToMany.service.impl;


import com.relationship.OneToMany.dto.request.OrderRequestDto;
import com.relationship.OneToMany.dto.response.OrderResponseDto;
import com.relationship.OneToMany.entity.Order;
import com.relationship.OneToMany.repo.CustomerRepo;
import com.relationship.OneToMany.repo.OrderRepo;
import com.relationship.OneToMany.service.CustomerService;
import com.relationship.OneToMany.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final  OrderRepo orderRepo;
    private final  CustomerRepo customerRepo;
    private final CustomerService customerService;

    //Save
    @Override
    public OrderResponseDto saveOrder(OrderRequestDto dto) {
        Order order = new Order();

        order.setOrderNo(dto.getOrderNo());

        order.setCustomer(customerRepo.findById(dto.getCustomer_id()).get());

        Order savedOrder = orderRepo.save(order);

        customerService.updateOrderList(savedOrder, dto.getCustomer_id());

        return new OrderResponseDto(savedOrder);
    }

    @Override
    public OrderResponseDto getByUniqueId(Integer id) {
        return new OrderResponseDto(orderRepo.findById(id).get());
    }

    @Override
    public List<OrderResponseDto> getAllData() {
        List<OrderResponseDto> returnList = new ArrayList<>();

        List<Order> allData = orderRepo.findAll();

        for(Order each: allData){
            returnList.add(new OrderResponseDto(each));
        }
        return returnList;
    }

    @Override
    public String deleteOrderById(Integer id) {
        orderRepo.deleteById(id);
        return "Id "+ id + " deleted.";
    }
}
