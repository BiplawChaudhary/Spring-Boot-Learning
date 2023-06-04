package com.dependency.dependencyPractice.controller;

import com.dependency.dependencyPractice.pojo.Books;
import com.dependency.dependencyPractice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @Autowired
    private TestService testService;

    @PostMapping("/book")
    public ResponseEntity<String> myFunction(@RequestBody Books b1){
        return new ResponseEntity<>(testService.bookDetailsView(b1), HttpStatus.OK);
    }
}
