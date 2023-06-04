package com.example.demo.service.impl;

import com.example.demo.dto.request.StudentRequestDto;
import com.example.demo.dto.response.StudentResponseDto;
import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    @Override
    public StudentResponseDto saveStudent(StudentRequestDto std) {
        Student newStudent = new Student();

        newStudent.setName(std.getName());

        Student savedStudent = studentRepo.save(newStudent);
        return new StudentResponseDto(savedStudent);
    }

    //Search By Id
    @Override
    public StudentResponseDto getByUniqueId(Integer id) {
        return new StudentResponseDto(studentRepo.findById(id).get());
    }

//    Get All student data
    @Override
    public List<StudentResponseDto> getAllStudent() {
        List<StudentResponseDto> returnData = new ArrayList<>();

        List<Student> readData = studentRepo.findAll();

        for(Student each: readData){
            returnData.add(new StudentResponseDto(each));
        }
        return returnData;
    }

//    Delete by Id
    @Override
    public String deleteById(Integer id) {
        studentRepo.deleteById(id);
        return "The id " + id + " has been deleted.";
    }

//    Update
    @Override
    public StudentResponseDto updateById(Integer id, StudentRequestDto data) {
        Student foundStudent = studentRepo.findById(id).get();

        foundStudent.setName(data.getName());

        return new StudentResponseDto(studentRepo.save(foundStudent));
    }
}
