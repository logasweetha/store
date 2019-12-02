package com.store.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.model.entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	public Product findByName(String name);

}
