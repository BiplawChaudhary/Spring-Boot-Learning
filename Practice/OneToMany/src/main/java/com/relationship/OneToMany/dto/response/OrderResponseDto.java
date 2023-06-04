package com.relationship.OneToMany.dto.response;

import com.relationship.OneToMany.entity.Customer;
import com.relationship.OneToMany.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponseDto {
    private Integer id;

    private String orderNo;

    private Customer customer;

    public OrderResponseDto(Order o1){
        this.id = o1.getId();
        this.orderNo = o1.getOrderNo();
        this.customer = o1.getCustomer();
    }
}
