package com.sboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.model.Product;
import com.sboot.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService ps;
	
	@GetMapping("/products")
	public List<Product> getProduct() {
		return ps.viewProducts();
	}
	
	@GetMapping("/product/{pid}")
	public Product getProduct(@PathVariable int pid) {
		return ps.viewProduct(pid);
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product p) {
		return ps.addProduct(p);
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product p) {
		return ps.updateProduct(p);
	}
	
	@DeleteMapping("/deleteProduct/{pid}")
	public String deleteProduct(@PathVariable int pid) {
		return ps.deleteProduct(pid);
	}
}
