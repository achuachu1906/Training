package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.repo.OrderRepository;

@Service
public class OrderService {

	private OrderRepository repo;

	@Autowired
	public OrderService(OrderRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Order> findAll(){
		return repo.findAll();
	}
	
    public Order save(Order entity) {
    	return repo.save(entity);
    }

}
