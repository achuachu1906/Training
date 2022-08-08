package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@Configuration
public class AppConfig {
	
	
	//ID of the bean is same as Method name.
	@Bean
	public Student ram() {
		return new Student(101, "Ramesh", 80);
		
	}
	@Bean
	public Teacher hari() {
		return new Teacher(5020, "Hari", "IT");
	}
    
	@Bean
	public Product tv() {
		return new Product(101, "LG");
	}
	
	@Bean
	public Customer suresh() {
		return new Customer(201, "Suresh");
	}
	
	@Bean
	public Customer magesh () {
		return new Customer(202, "magesh");
	}
	
	@Bean
	public Customer ramesh () {
		return new Customer(203, "ramesh");
	}
	
}