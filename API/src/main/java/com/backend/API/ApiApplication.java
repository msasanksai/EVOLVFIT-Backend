package com.backend.API;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Successful");
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
