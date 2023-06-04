package com.relationship.OneToMany.controller;


import com.relationship.OneToMany.dto.request.CustomerRequestDto;
import com.relationship.OneToMany.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    //Save
    @PostMapping("/saveCustomer")
    public ResponseEntity<?> saveTheCustomer(@RequestBody CustomerRequestDto dto){
        return new ResponseEntity<>(customerService.saveCustomer(dto), HttpStatus.CREATED);
    }

    //GetById
    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id){
        return new ResponseEntity<>(customerService.getById(id), HttpStatus.OK);
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(customerService.getAllCustomer(),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        return new ResponseEntity<>(customerService.deleteById(id), HttpStatus.OK);
    }
}
