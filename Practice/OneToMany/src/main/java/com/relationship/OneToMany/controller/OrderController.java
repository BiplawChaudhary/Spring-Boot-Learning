package com.relationship.OneToMany.controller;


import com.relationship.OneToMany.dto.request.OrderRequestDto;
import com.relationship.OneToMany.service.OrderService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    //Save
    @PostMapping("/saveOrder")
    public ResponseEntity<?> saveOrder(@RequestBody OrderRequestDto dto){
        return new ResponseEntity<>(orderService.saveOrder(dto), HttpStatus.CREATED);
    }

    //Get
    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<?> getId(@PathVariable Integer id){
        return new ResponseEntity<>( orderService.getByUniqueId(id),HttpStatus.OK );
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getId(){
        return new ResponseEntity<>( orderService.getAllData(),HttpStatus.OK );
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteId(@PathVariable Integer id){
        return new ResponseEntity<>( orderService.deleteOrderById(id),HttpStatus.OK );
    }
}
