package com.biplaw.dbtest.repository;

import com.biplaw.dbtest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
