package com.javaprojectspring.javaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojectspring.javaproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
