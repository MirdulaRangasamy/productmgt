package com.sboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sboot.model.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {

}
