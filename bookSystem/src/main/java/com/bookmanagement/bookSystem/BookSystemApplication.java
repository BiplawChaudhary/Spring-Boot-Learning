package com.bookmanagement.bookSystem;

import com.bookmanagement.bookSystem.entity.Books;
import com.bookmanagement.bookSystem.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookSystemApplication.class, args);
	}

	@Autowired
	private BookRepo bookRepo;

	@Override
	public void run(String... args) throws Exception {
//		//Saving first Book
//		Books b1 = new Books();
//
//		b1.setName("It Ends With Us");
//		b1.setAuthor("Colleen Hoover");
//		b1.setPrice(500.0);
//
//		bookRepo.save(b1);
//
//
//		//Saving Second Book
//		Books b2 = new Books();
//
//		b2.setName("Harry Potter");
//		b2.setAuthor("J.K. Rowling");
//		b2.setPrice(500.0);
//		bookRepo.save(b2);

	}
}
