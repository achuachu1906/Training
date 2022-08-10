package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.services.OrderService;


@RestController
@RequestMapping(path= "/api/v1/orders")
public class OrderController {

	@Autowired
	public OrderService service;
	

    @PostMapping
	public Order add(@RequestBody Order entity) {
		return this.service.save(entity);
	}
	@GetMapping
	public List<Order> findAll(){
		return this.service.findAll();
		 }

}
