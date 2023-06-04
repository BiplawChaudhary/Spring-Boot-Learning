package com.relationship.OneToMany.dto.response;

import com.relationship.OneToMany.entity.Customer;
import com.relationship.OneToMany.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponseDto {
    private Integer id;
    private String name;
    private List<Order> order;

    public CustomerResponseDto(Customer customer){
        this.id = customer.getId();
        this.name = customer.getName();
        this.order = customer.getOrder();
    }
}
