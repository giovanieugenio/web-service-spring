package com.javaprojectspring.javaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojectspring.javaproject.entities.OrderItem;
import com.javaprojectspring.javaproject.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
	

}
