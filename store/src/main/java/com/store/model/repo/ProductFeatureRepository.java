package com.store.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.model.entity.Product;
import com.store.model.entity.ProductFeatures;



public interface ProductFeatureRepository extends
		JpaRepository<ProductFeatures, Long> {

	Product findByName(String name);
	
	//public Product findByName(String name);

}
