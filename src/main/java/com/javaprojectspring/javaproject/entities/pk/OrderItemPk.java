package com.javaprojectspring.javaproject.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.annotations.ManyToAny;

import com.javaprojectspring.javaproject.entities.Order;
import com.javaprojectspring.javaproject.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;

@Embeddable
public class OrderItemPk implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManyToAny
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToAny
	@JoinColumn(name = "product_id")
	private Product product;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(order, product);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPk other = (OrderItemPk) obj;
		return Objects.equals(order, other.order) && Objects.equals(product, other.product);
	}
}
