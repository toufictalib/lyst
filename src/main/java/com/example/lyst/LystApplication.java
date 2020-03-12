package com.example.lyst;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.lyst.dao.UserDetails;
import com.example.lyst.repository.UserRepository;

@SpringBootApplication
public class LystApplication {

	public static void main(String[] args) {
		SpringApplication.run(LystApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new UserDetails("admin", "admin", "admin@admin.com", "admin"));
			repository.save(new UserDetails("John", "doe", "john@doe.com", "johndoe"));
			repository.save(new UserDetails("sham", "tis", "sham@yahoo.com", "shamtis"));

		};
	}

}
