package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@ToString
@Component
@NoArgsConstructor
public class Bill {
	Customer customer;
	Product product;
	
	@Autowired
	public void setCustomer(@Qualifier("magesh")Customer customer) {
		System.out.println("Invoice Constructor called ==========");
		this.customer = customer;
	}
	
	@Autowired
	public void setProduct(Product product) {
		System.out.println("Invoice Constructor called ==========");
		this.product = product;
	}
	}
	