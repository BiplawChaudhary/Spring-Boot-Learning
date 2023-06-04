package com.thymelaf.thymeleafPrac.repo;

import com.thymelaf.thymeleafPrac.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
}
