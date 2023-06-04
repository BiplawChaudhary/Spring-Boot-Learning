package com.bookmanagement.bookSystem.repo;

import com.bookmanagement.bookSystem.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Books, Integer> {
}
