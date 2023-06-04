package com.product.productms.service.impl;

import com.product.productms.Repo.ProductRepo;
import com.product.productms.dto.request.ProductRequestDto;
import com.product.productms.dto.response.ProductResponseDto;
import com.product.productms.entity.Product;
import com.product.productms.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    //Code to get all products
    @Override
    public List<ProductResponseDto> getAllProduct() {
        List<ProductResponseDto> returnData = new ArrayList<>();

        List<Product> allProducts = productRepo.findAll();

        for(Product each: allProducts){
            returnData.add(new ProductResponseDto(each));
        }
        return returnData;
    }


//    Code to get product by Id
    @Override
    public ProductResponseDto getProductById(Integer id) {

        Product foundProduct = productRepo.findById(id).get();
        return new ProductResponseDto(foundProduct);
    }

//    Code to save the product
    @Override
    public ProductResponseDto saveTheProduct(ProductRequestDto dto) {

        Product newProduct = new Product();

        newProduct.setName(dto.getName());
        newProduct.setDesc(dto.getDesc());
        newProduct.setPrice(dto.getPrice());
        newProduct.setQuantity(dto.getQuantity());

        Product savedProduct = productRepo.save(newProduct);
        return new ProductResponseDto(savedProduct);
    }

    //Code to update product
    @Override
    public ProductResponseDto updateProduct(Integer id, ProductRequestDto newData) {
        Product foundProduct = productRepo.findById(id).get();

        foundProduct.setName(newData.getName());
        foundProduct.setDesc(newData.getDesc());
        foundProduct.setQuantity(newData.getQuantity());
        foundProduct.setPrice(newData.getPrice());

        Product savedProduct = productRepo.save(foundProduct);

        return new ProductResponseDto(savedProduct);
    }

//Code to delete product
    @Override
    public String deleteProduct(Integer id) {
        productRepo.deleteById(id);
        return  "Product "+ id +" deleted";
    }
}
