package com.ericestudosjava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericestudosjava.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
