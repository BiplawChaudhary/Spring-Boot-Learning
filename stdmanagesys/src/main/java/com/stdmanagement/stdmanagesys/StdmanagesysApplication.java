package com.stdmanagement.stdmanagesys;

import com.stdmanagement.stdmanagesys.entity.Student;
import com.stdmanagement.stdmanagesys.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//CommandLine runner basically runs the command at the startup
public class StdmanagesysApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StdmanagesysApplication.class, args);
	}

//	Here we'll write logic to insert some records at the start of our application'
//	Injecting student repo
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {

//		Saving first student
//		Student std1 = new Student();
//		std1.setFirstName("Sabina");
//		std1.setLastName("Thapa");
//		std1.setEmail("sabinathapa722@gmail.com");
//		studentRepo.save(std1);

//		Saving second student
//		Student std2 = new Student();
//		std2.setFirstName("Biplaw");
//		std2.setLastName("Chaudhary");
//		std2.setEmail("beeplaw21@gmail.com");
//		studentRepo.save(std2);

	}
}
