package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.ProductRepository;
import com.example.demo.model.Product;

@Service
public class ProductService {
	
	private ProductRepository repo;
	@Autowired
	public ProductService(ProductRepository repo) {
		super();
		this.repo = repo;
	}
	public List<Product> findAll(){
		return repo.findAll();
	}
	public Product add(Product entity) {
		return repo.save(entity);
	}


}
