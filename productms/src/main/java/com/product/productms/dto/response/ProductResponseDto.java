package com.product.productms.dto.response;


import com.product.productms.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDto {
    private Integer id;
    private String name;
    private String desc;
    private Integer price;
    private Integer quantity;
    private String category;

    public ProductResponseDto(Product p1){
        this.id = p1.getId();
        this.name = p1.getName();
        this.desc = p1.getDesc();
        this.price = p1.getPrice();
        this.quantity = p1.getQuantity();
        this.category = p1.getCategory();
    }
}
