package com.product.productms.service;

import com.product.productms.dto.request.ProductRequestDto;
import com.product.productms.dto.response.ProductResponseDto;

import java.util.List;

public interface ProductService {

    //Get All Products
    List<ProductResponseDto> getAllProduct();

    //Get Product By Id
    ProductResponseDto getProductById(Integer id);

    //Save Product
    ProductResponseDto saveTheProduct(ProductRequestDto dto);

    //Update Product
    ProductResponseDto updateProduct(Integer id, ProductRequestDto newData);

    //Delete Product
    String deleteProduct(Integer id);


}
