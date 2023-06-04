package com.stdmanagement.stdmanagesys.service;

import com.stdmanagement.stdmanagesys.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student std);

    Student getStudentById(Long id);
    Student editStudent(Student student);

    void deleteStudentById(Long id);
}
