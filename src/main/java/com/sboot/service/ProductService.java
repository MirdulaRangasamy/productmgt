package com.sboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sboot.model.Product;

@Service
public interface ProductService {
	Product addProduct(Product p);
	Product viewProduct(int pid);
	List<Product> viewProducts();
	String deleteProduct(int pid);
	Product updateProduct(Product p);
	
}
