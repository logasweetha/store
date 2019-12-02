package com.store.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.store.model.entity.Customer;
import com.store.model.entity.Product;
import com.store.model.service.CustomerService;
import com.store.model.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	
	@Autowired
	private CustomerService customerService;
	
	

	@GetMapping(path = "product")
	public List<Product> getAllProducts() {
		List<Product> products = productService.getAllProducts();
		return products;
	}

	@GetMapping(path = "product/{productName}")
	public Product getProductByName(
			@PathVariable(value = "productName") String productName) {
		Product product = productService.findProductByName(productName);
		return product;
	}
	
	@GetMapping(path = "allcustomer",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomers(){
		return customerService.findAll();
	}

	@PostMapping(path = "users",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		return new ResponseEntity<Customer>(customerService.addCustomer(customer),HttpStatus.CREATED);
	}
	
	
	/*@GetMapping(path = "/product/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Resource<Product>> getByName(
			@PathVariable(name = "name") String name) {
		Product product = productService.findProductByName(name);

		Resource<Product> productResourse = new Resource<Product>(product);

		ControllerLinkBuilder link = linkTo(methodOn(this.getClass())
				.getAllBooks());

	}*/

}
