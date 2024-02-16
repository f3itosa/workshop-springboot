package com.ericestudosjava.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ericestudosjava.curso.entities.User;
import com.ericestudosjava.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Eric Batista", "batista@gmail.com", "000000000", "123456"); 
		User u2 = new User(null, "Eric Feitosa", "feitosa@gmail.com", "111111111", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	

}
