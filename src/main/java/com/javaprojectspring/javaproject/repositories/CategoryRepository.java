package com.javaprojectspring.javaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojectspring.javaproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
