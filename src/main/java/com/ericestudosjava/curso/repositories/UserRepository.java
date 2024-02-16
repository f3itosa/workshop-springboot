package com.ericestudosjava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericestudosjava.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
