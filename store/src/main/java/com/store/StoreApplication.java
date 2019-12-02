package com.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.store.model.entity.Customer;
import com.store.model.entity.Product;
import com.store.model.entity.ProductFeatures;
import com.store.model.entity.Reviews;
import com.store.model.entity.Store;
import com.store.model.repo.CustomerRepository;
import com.store.model.repo.ProductFeatureRepository;
import com.store.model.repo.ProductRepository;
import com.store.model.repo.ReviewsRepository;
import com.store.model.repo.StoreRepository;

@EnableTransactionManagement
@SpringBootApplication
public class StoreApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private StoreRepository storeRepository;

	@Autowired
	private ReviewsRepository reviewsRepository;
	@Autowired
	private ProductFeatureRepository productfeatureRepository;

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*Customer customer1 = new Customer("loga", "loga@gmail.com", "787899777", "loga","Hyderabad");
		Customer customer2 = new Customer("madhu", "madhu@gmail.com", "98233440","madhu", "Jaipur");
		Customer customer3 = new Customer("veni", "veni@gmail.com", "32566555","veni", "Mumbai");

		customerRepository.save(customer1);
		customerRepository.save(customer2);
		customerRepository.save(customer3);

		Product product1 = new Product("iphone", 80000, 50);
		Product product2 = new Product("nokia", 40000, 100);
		Product product3 = new Product("samsung", 50000, 150);
		Product product4 = new Product("realme", 45000, 120);
		Product product5 = new Product("redmi", 30000, 70);
		Product product6 = new Product("oppo", 20000, 90);
		Product product7 = new Product("gionee", 35000, 160);
		Product product8 = new Product("honor", 25000, 80);
		Product product9 = new Product("vivo", 15000, 110);
		Product product10 = new Product("mototrola", 10000, 20);

		customer1.getProducts().add(product1);
		customer1.getProducts().add(product2);
		customer1.getProducts().add(product3);

		customer2.getProducts().add(product4);
		customer2.getProducts().add(product5);
		customer2.getProducts().add(product6);
		customer2.getProducts().add(product7);

		customer3.getProducts().add(product8);
		customer3.getProducts().add(product9);
		customer3.getProducts().add(product10);

		product1.setCustomer(customer1);
		product2.setCustomer(customer1);
		product3.setCustomer(customer1);

		product4.setCustomer(customer2);
		product5.setCustomer(customer2);
		product6.setCustomer(customer2);
		product7.setCustomer(customer2);

		product8.setCustomer(customer3);
		product9.setCustomer(customer3);
		product10.setCustomer(customer3);

		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		productRepository.save(product4);
		productRepository.save(product5);
		productRepository.save(product6);
		productRepository.save(product7);
		productRepository.save(product8);
		productRepository.save(product9);
		productRepository.save(product10);

		Store store1 = new Store("Reliance", "Delhi", "r@r.com", "89767282");
		Store store2 = new Store("BigC", "Bagalore", "b@b.com", "901624248");
		Store store3 = new Store("Lott", "Raipur", "l@l.com", "763322344");
		Store store4 = new Store("Samsung Store", "Kolkata", "s@s.com", "656716165");
		Store store5 = new Store("OppoStore", "Mangalore", "o@o.com", "454324566");

		store1.getProducts().add(product1);
		store1.getProducts().add(product2);
		store1.getProducts().add(product3);
		store1.getProducts().add(product4);

		store2.getProducts().add(product5);
		store2.getProducts().add(product6);
		store2.getProducts().add(product7);

		store3.getProducts().add(product8);
		store3.getProducts().add(product9);
		store3.getProducts().add(product10);

		store4.getProducts().add(product10);
		store4.getProducts().add(product8);
		store4.getProducts().add(product6);
		store4.getProducts().add(product4);
		store4.getProducts().add(product2);

		store5.getProducts().add(product1);
		store5.getProducts().add(product9);
		store5.getProducts().add(product7);
		store5.getProducts().add(product5);
		store5.getProducts().add(product3);

		product1.getStores().add(store1);
		product1.getStores().add(store5);

		product2.getStores().add(store1);
		product2.getStores().add(store4);

		product3.getStores().add(store1);
		product3.getStores().add(store5);

		product4.getStores().add(store1);
		product4.getStores().add(store4);

		product5.getStores().add(store2);
		product5.getStores().add(store5);

		product6.getStores().add(store2);
		product6.getStores().add(store4);

		product7.getStores().add(store2);
		product7.getStores().add(store5);

		product8.getStores().add(store3);
		product8.getStores().add(store4);

		product9.getStores().add(store3);
		product9.getStores().add(store5);

		product10.getStores().add(store3);
		product10.getStores().add(store4);

		storeRepository.save(store1);
		storeRepository.save(store2);
		storeRepository.save(store3);
		storeRepository.save(store4);
		storeRepository.save(store5);

		Reviews review1 = new Reviews(3.4, "notsatisfied");
		Reviews review2 = new Reviews(4.4, "good");
		Reviews review3 = new Reviews(4.5, "excellent");
		Reviews review4 = new Reviews(4.0, "satisfied");
		Reviews review5 = new Reviews(4.9, "outstanding");
		Reviews review6 = new Reviews(3.5, "average");

		review1.setStore(store1);
		review2.setStore(store2);
		review3.setStore(store3);
		review4.setStore(store4);
		review5.setStore(store5);
		review6.setStore(store1);
		review2.setStore(store5);
		review2.setStore(store3);

		reviewsRepository.save(review1);
		reviewsRepository.save(review2);
		reviewsRepository.save(review3);
		reviewsRepository.save(review4);
		reviewsRepository.save(review5);
		reviewsRepository.save(review6);

		ProductFeatures profea1 = new ProductFeatures("iphone", "U.S", "windows", "v1");
		ProductFeatures profea2 = new ProductFeatures("nokia", "India", "windows", "v1");
		ProductFeatures profea3 = new ProductFeatures("samsung", "India", "android", "v3");
		ProductFeatures profea4 = new ProductFeatures("realme", "India", "android", "v2");
		ProductFeatures profea5 = new ProductFeatures("redmi", "India", "android", "v1");
		ProductFeatures profea6 = new ProductFeatures("oppo", "India", "android", "v1");
		ProductFeatures profea7 = new ProductFeatures("gionee", "India", "android", "v3");
		ProductFeatures profea8 = new ProductFeatures("honor", "India", "android", "v1");
		ProductFeatures profea9 = new ProductFeatures("vivo", "India", "android", "v2");
		ProductFeatures profea10 = new ProductFeatures("mortola", "India", "android", "v2");

		productfeatureRepository.save(profea1);
		productfeatureRepository.save(profea2);
		productfeatureRepository.save(profea3);
		productfeatureRepository.save(profea4);
		productfeatureRepository.save(profea5);
		productfeatureRepository.save(profea6);
		productfeatureRepository.save(profea7);
		productfeatureRepository.save(profea8);
		productfeatureRepository.save(profea9);
		productfeatureRepository.save(profea10);*/

	}

}
