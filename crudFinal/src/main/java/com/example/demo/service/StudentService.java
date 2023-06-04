package com.example.demo.service;

import com.example.demo.dto.request.StudentRequestDto;
import com.example.demo.dto.response.StudentResponseDto;

import java.util.List;

public interface StudentService {
    StudentResponseDto saveStudent(StudentRequestDto std);

    //Get By Id
    StudentResponseDto getByUniqueId(Integer id);

    //Get All
    List<StudentResponseDto> getAllStudent();

    //Delete the student by Id
    String deleteById(Integer id);

    //Update Student;
    StudentResponseDto updateById(Integer id, StudentRequestDto data);


}
