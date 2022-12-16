package com.sboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.dao.ProductDao;
import com.sboot.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao pdao;
	
	@Override
	public Product addProduct(Product p) {
		return pdao.save(p);
	}

	@Override
	public Product viewProduct(int pid) {
		return pdao.findById(pid).orElse(new Product());
	}

	@Override
	public List<Product> viewProducts() {
		return pdao.findAll();
	}

	@Override
	public String deleteProduct(int pid) {
		Product p = pdao.findById(pid).orElse(null);
		//pdao.deleteById(pid);
		if(p!=null) {
			pdao.delete(p);
			return "Deleted Sucsess";
		}
		return "Product Unavailable";
	}

	@Override
	public Product updateProduct(Product p) {
		
		Product p1 = pdao.findById(p.getPid()).orElse(null);
		if(p!=null) {
			pdao.delete(p);
		}
		return pdao.save(p);
	}

}
