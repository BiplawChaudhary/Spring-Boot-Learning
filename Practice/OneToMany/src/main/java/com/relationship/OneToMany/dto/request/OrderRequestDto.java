package com.relationship.OneToMany.dto.request;


import com.relationship.OneToMany.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDto {
    private String orderNo;

    private Integer customer_id;
}
