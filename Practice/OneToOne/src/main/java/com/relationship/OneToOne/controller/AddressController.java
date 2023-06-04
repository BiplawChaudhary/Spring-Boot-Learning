package com.relationship.OneToOne.controller;


import com.relationship.OneToOne.dto.request.AddressRequestDto;
import com.relationship.OneToOne.repo.AddressRepo;
import com.relationship.OneToOne.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    @PostMapping("/save")
    public ResponseEntity<?> saveAddress(@RequestBody AddressRequestDto dto){
        return new ResponseEntity<>(addressService.saveAddress(dto), HttpStatus.CREATED);
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<?> getId(@PathVariable Integer id){
        return new ResponseEntity<>(addressService.getById(id), HttpStatus.OK);
    }
}
