package com.thymelaf.thymeleafPrac.controller;

import com.thymelaf.thymeleafPrac.dto.request.BookRequestDto;
import com.thymelaf.thymeleafPrac.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //To get data from user and save
    @PostMapping("/save")
    public ResponseEntity<?> saveInfo (@RequestBody BookRequestDto dto){
        return new ResponseEntity<>(bookService.saveInfo(dto), HttpStatus.OK);
    }


    //Showing info by using the id
    @GetMapping("/show-by-id/{id}")
    public ResponseEntity<?> showInfoById(@PathVariable Integer id){
        return new ResponseEntity<>(bookService.getInfoById(id),HttpStatus.OK);
    }


    //Showing All info
    @GetMapping("/show-All")
    public ResponseEntity<?> showAll(){
        return new ResponseEntity<>(bookService.ShowAll(),HttpStatus.OK);
    }

    //Updating
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateInfo (@PathVariable Integer id, @RequestBody BookRequestDto dto){
        return new ResponseEntity<>(bookService.updateInfo(id,dto),HttpStatus.OK);
    }

    //Deleting
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById (@PathVariable Integer id){
        return new ResponseEntity<>(bookService.deleteInfo(id),HttpStatus.OK);
    }









}
