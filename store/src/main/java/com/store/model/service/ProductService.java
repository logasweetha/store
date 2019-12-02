package com.store.model.service;

import java.util.List;
import com.store.model.entity.Product;

public interface ProductService {

	public List<Product> getAllProducts();

	public Product findProductByName(String productName);

}
