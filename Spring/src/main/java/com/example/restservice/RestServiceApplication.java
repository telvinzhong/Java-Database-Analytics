package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RestServiceApplication implements CommandLineRunner {
	@Autowired
	UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		listAll();
	}

	public void listAll() {
		System.out.println("Listing 10 sample data");
		List<User> list = repository.findAll();
		for (int i = 0; i < 10; i++) {
			System.out.println(list.get(i));
		}
	}
}
