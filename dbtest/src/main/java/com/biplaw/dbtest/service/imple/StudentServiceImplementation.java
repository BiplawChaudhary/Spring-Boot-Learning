package com.biplaw.dbtest.service.imple;

import com.biplaw.dbtest.dto.request.StudentRequestDto;
import com.biplaw.dbtest.dto.response.StudentResponseDto;
import com.biplaw.dbtest.entity.Student;
import com.biplaw.dbtest.repository.AddressRepo;
import com.biplaw.dbtest.repository.StudentRepo;
import com.biplaw.dbtest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplementation implements StudentService {
    private final StudentRepo studentRepo;


    //Construction INjection -->> more secure
    //DTO
    //Keep the properties in pojo that we take input from user or that we've to show to user.
    public StudentServiceImplementation(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public StudentResponseDto saveStudent(StudentRequestDto std) {

        Student student = new Student();

        student.setName(std.getName());

        Student savedStudent = studentRepo.save(student);

        StudentResponseDto studentResponseDto = new StudentResponseDto(savedStudent);
        return studentResponseDto;
    }
}
