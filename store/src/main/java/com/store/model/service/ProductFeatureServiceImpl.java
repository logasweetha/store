package com.store.model.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.model.entity.Product;
import com.store.model.repo.ProductFeatureRepository;

@Service
@Transactional
public class ProductFeatureServiceImpl implements ProductFeatureService {
	@Autowired
	private ProductFeatureRepository productfeatureRepository;

	@Override
	public Product findByName(String name) {

		return productfeatureRepository.findByName(name);
	}

}
