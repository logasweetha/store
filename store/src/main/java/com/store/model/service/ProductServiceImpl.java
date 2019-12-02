package com.store.model.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.model.entity.Product;
import com.store.model.repo.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {

		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product findProductByName(String productName) {
		Product product = productRepository.findByName(productName);
		return product;
	}

	/*
	 * @Override public Product findByProductName(String productName) { Product
	 * product=productRepository.findByProductName(productName); return product;
	 * }
	 */
}
