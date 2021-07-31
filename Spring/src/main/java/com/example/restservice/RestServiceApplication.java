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
		System.out.println("Server is running on port 8080!");
	}

	public void listAll() {
		System.out.println("Listing 10 sample data");
		List<User> list = repository.findAll();
		for (int i = 0; i < 1; i++) {
			User user = list.get(i);
			for (String s : user.getSummary()) {
				int index = s.indexOf("duration");
				int j = index;
				while (s.charAt(j) != ',') {
					j++;
				}
				System.out.println(s.substring(index + 11, j));
				System.out.println(s);
				System.out.println(s.indexOf("duration"));
			}
		}
	}
}
