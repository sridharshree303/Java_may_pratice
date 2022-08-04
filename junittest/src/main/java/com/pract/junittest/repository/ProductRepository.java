package com.pract.junittest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pract.junittest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}
