package com.example.demo.controllers;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/")
public class UserController {
	
	@GetMapping(path = "/users")
	public String getUser() {
		return "achu";
	}
	
	@GetMapping(path = "/users/{id}")
	@RolesAllowed(value = {"ROLE_ADMIN","ROLE_GUEST"})
	public String getUserById(@PathVariable int id) {
		
		if(id==1) {
			
			return "user achu";
		}else {
			return "manager achu";
		}
	}
}
