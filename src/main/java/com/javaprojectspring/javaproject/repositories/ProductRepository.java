package com.javaprojectspring.javaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojectspring.javaproject.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{
	
}


