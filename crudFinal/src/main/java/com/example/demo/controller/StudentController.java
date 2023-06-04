package com.example.demo.controller;

import com.example.demo.dto.request.StudentRequestDto;
import com.example.demo.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> getSavedAddress(@RequestBody StudentRequestDto request){
        return new ResponseEntity<>(studentService.saveStudent(request), HttpStatus.CREATED);
    }

    //Read
    @GetMapping("/getById/{id}")
    @Operation(description = "Get value by Unique id")
    public ResponseEntity<?> getValueById(@PathVariable Integer id){
        return new ResponseEntity<>(studentService.getByUniqueId(id), HttpStatus.OK);
    }

    @GetMapping("/get-all")
    @Operation(description = "To read all values")
    public ResponseEntity<?> readAllValues(){
        return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.OK);
    }

    //Update
    @PutMapping("/update/{id}")
    @Operation(description = "To update data on table")
    public ResponseEntity<?> updateDataOnStudent(@PathVariable Integer id, @RequestBody StudentRequestDto data){
        return new ResponseEntity<>(studentService.updateById(id, data), HttpStatus.OK);
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    @Operation(description = "Delete Value by Id")
    public ResponseEntity<?> deleteByIdStudent(@PathVariable Integer id){
        return new ResponseEntity<>(studentService.deleteById(id), HttpStatus.OK);
    }
}
