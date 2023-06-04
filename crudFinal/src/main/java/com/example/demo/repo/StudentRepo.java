package com.example.demo.repo;

import com.example.demo.entity.Student;
import org.hibernate.hql.internal.ast.tree.IdentNode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
