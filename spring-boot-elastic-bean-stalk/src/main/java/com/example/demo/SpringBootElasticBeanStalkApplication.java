package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Product;

@SpringBootApplication
public class SpringBootElasticBeanStalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootElasticBeanStalkApplication.class, args);
	}
	@Bean
	public Product tv() {
		return new Product(101,"sony tv",26000);
	}
	
	@Bean
	public Product printer() {
		return new Product(102,"XYZ",15000);
	}


}
