package com.retail;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SuperMarketApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SuperMarketApplication.class, args);
		System.out.println("Hello customers welcome to the super market");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Select the products from the list");
		
	}

}
