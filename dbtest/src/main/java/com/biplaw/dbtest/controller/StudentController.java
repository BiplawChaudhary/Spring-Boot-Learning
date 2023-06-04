package com.biplaw.dbtest.controller;

import com.biplaw.dbtest.dto.request.StudentRequestDto;
import com.biplaw.dbtest.dto.response.StudentResponseDto;
import com.biplaw.dbtest.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    public ResponseEntity<StudentResponseDto> saveStudent(@RequestBody StudentRequestDto std){
        return new ResponseEntity<>(studentService.saveStudent(std), HttpStatus.CREATED);
    }

}
