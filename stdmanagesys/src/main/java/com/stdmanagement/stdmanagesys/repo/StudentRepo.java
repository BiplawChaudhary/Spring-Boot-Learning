package com.stdmanagement.stdmanagesys.repo;

import com.stdmanagement.stdmanagesys.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
