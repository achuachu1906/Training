package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.User;
import com.example.demo.services.UserService;



@RestController
@RequestMapping(path= "/api/v1/users")
public class UserController {
	

	@Autowired
	public UserService service;
	

    @PostMapping
	public User add(@RequestBody User entity) {
		return this.service.save(entity);
	}
	@GetMapping
	public List<User> findAll(){
		return this.service.findAll();
		 }

	@GetMapping(path= "/{id}")
	public User findById(@PathVariable("id") int id) {
		return this.service.findById(id).orElseThrow(() -> new RuntimeException("Element Not Found"));
	}

}
