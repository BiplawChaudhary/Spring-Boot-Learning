package com.stdmanagement.stdmanagesys.service.impl;


import com.stdmanagement.stdmanagesys.entity.Student;
import com.stdmanagement.stdmanagesys.repo.StudentRepo;
import com.stdmanagement.stdmanagesys.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student std) {
        return studentRepo.save(std);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public Student editStudent(Student student) {

        return studentRepo.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepo.deleteById(id);
    }
}
