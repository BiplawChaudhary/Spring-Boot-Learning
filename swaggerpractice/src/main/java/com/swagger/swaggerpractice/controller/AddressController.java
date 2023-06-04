package com.swagger.swaggerpractice.controller;

import com.swagger.swaggerpractice.dto.request.AddressRequestDto;
import com.swagger.swaggerpractice.service.AddressService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/save")
    @Operation(summary = "save the address to database", description = "Save to database")
    public ResponseEntity<?> saveTo(@RequestBody AddressRequestDto dto){
        return new ResponseEntity<>(addressService.saveAddress(dto), HttpStatus.CREATED);
    }
}
