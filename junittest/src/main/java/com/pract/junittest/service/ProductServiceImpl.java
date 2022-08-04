package com.pract.junittest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pract.junittest.model.Product;
import com.pract.junittest.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	private final ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Optional<Product> findById(Integer id) {
		return productRepository.findById(id);
	}

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public boolean update(Product product) {
		productRepository.save(product);
		return true;
	}

	@Override
	public Product save(Product product) {
		product.setVersion(1);
		return productRepository.save(product);
	}

	@Override
	public boolean delete(Integer id) {
		productRepository.deleteById(id);
		return true;
	}
}
