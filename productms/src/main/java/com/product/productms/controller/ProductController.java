package com.product.productms.controller;

import com.product.productms.dto.request.ProductRequestDto;
import com.product.productms.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    //Getting all the products
    @GetMapping("/get-all")
    public ResponseEntity<?> getAllProduct(){
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
    }

    //Getting a product by id
    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<?> getProductByItsId(@PathVariable Integer id){
        return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
    }

    //Saving the product
    @PostMapping("/save")
    public ResponseEntity<?> saveTheProduct(@RequestBody ProductRequestDto dto){
        return new ResponseEntity<>(productService.saveTheProduct(dto), HttpStatus.CREATED);
    }

    //Update the product
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateTheProduct(@PathVariable Integer id, @RequestBody ProductRequestDto dto){
        return new ResponseEntity<>(productService.updateProduct(id, dto), HttpStatus.OK);
    }

    //Deelte the product
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
        return new ResponseEntity<>(productService.deleteProduct(id), HttpStatus.OK);
    }
}
