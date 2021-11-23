package com.retail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SuperMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperMarketApplication.class, args);
		System.out.println("Hello customers welcome to the super market");
	}

}
