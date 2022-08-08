package com.example.demo.services;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")

public class LoanService {
	public double getInterestRate(int value) {
		System.out.println("value in service"+value);
		return 4.5;
	}
	

}
