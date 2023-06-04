package com.example.demo.controller;


import com.example.demo.dto.request.AddressRequestDto;
import com.example.demo.service.AddressService;
import io.swagger.v3.oas.annotations.Operation;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/save")
    @Operation(summary="Save to database",description = "To save the address")
    public ResponseEntity<?> returnSavedAddress(@RequestBody AddressRequestDto address){
        return new ResponseEntity<>(addressService.saveAddress(address), HttpStatus.CREATED);
    }

    //To search for a vlaue using unique integer
    @GetMapping("search/{id}")
    @Operation(summary = "Get by Id", description = "Find by Id")
    public ResponseEntity<?> returnGetById(@PathVariable Integer id){
        return new ResponseEntity<>(addressService.getByUniqueId(id), HttpStatus.OK);
    }

    //To get all the values from database
    @GetMapping("/get-all")
    @Operation(summary = "Read all values form database", description = "Read all values")
    public ResponseEntity<?> getAllValues(){
        return new ResponseEntity<>(addressService.getAllValues(), HttpStatus.OK);
    }

    //Controller to perform the delete operation

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Delete a value from table", description = "Delete a value by id")
    public ResponseEntity<?> deleteValue(@PathVariable Integer id){
        return new ResponseEntity<>(addressService.deleteByUniqueId(id), HttpStatus.OK);
    }


    //update the variable
    @PutMapping("/update/{id}")
    @Operation(description = "Update the value", summary = "This api updates the data.")
    public ResponseEntity<?> updateTheAddress(@PathVariable Integer id, @RequestBody AddressRequestDto data){
        return new ResponseEntity<>(addressService.updateValue(id, data), HttpStatus.OK);
    }
//    @GetMapping("/get-all")
//    @Operation(description = "Get all values", summary = "get all values form databse")
//    public ResponseEntity<?> returnAllSaved(){
//        return new ResponseEntity<>(addressService.getAllAddresses(),HttpStatus.OK);
//    }

//    @GetMapping("/get-by-id")
//    @Operation(description = "Get by id", summary = "Get by id")
//    public ResponseEntity<?> returnById(@RequestBody Integer id){
//        return new ResponseEntity<>(addressService.getById(id), HttpStatus.OK);
//    }


}
