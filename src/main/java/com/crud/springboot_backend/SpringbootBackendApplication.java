package com.crud.springboot_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.springboot_backend.model.User;
import com.crud.springboot_backend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setFirstName("John");
		user.setLastName("Doe");
		user.setEmail("john.doe@example.com");
		user.setPassword("password123");
		userRepository.save(user);

		User user1 = new User();
		user1.setFirstName("Jane");
		user1.setLastName("Smith");
		user1.setEmail("jane.smith@example.com");
		user1.setPassword("password456");
		userRepository.save(user1);
	}
}
