package com.relationship.OneToOne.controller;

import com.relationship.OneToOne.dto.request.UserRequestDto;
import com.relationship.OneToOne.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<?> saveUserData(@RequestBody UserRequestDto dto){
        return new ResponseEntity<>(userService.userSave(dto), HttpStatus.CREATED);
    }

    @GetMapping("/find-by-id/{id}")
    public ResponseEntity<?> findid(@PathVariable Integer id){
        return new ResponseEntity<>(userService.getById(id), HttpStatus.OK);
    }
}
