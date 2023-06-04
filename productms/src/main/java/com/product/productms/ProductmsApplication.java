package com.product.productms;

import com.product.productms.Repo.ProductRepo;
import com.product.productms.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ProductmsApplication implements CommandLineRunner {

	private final ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(ProductmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Product p1 = new Product();
//		p1.setName("Fair and Lovely");
//		p1.setDesc("Whiteness Cream");
//		p1.setPrice(100);
//		p1.setQuantity(10);
//		p1.setCategory("face");
//
//		productRepo.save(p1);
//
//
//		Product p2 = new Product();
//		p2.setName("Coconut Oil");
//		p2.setDesc("Hair Oil");
//		p2.setPrice(500);
//		p2.setQuantity(15);
//		p2.setCategory("hair");
//
//		productRepo.save(p2);
	}
}
