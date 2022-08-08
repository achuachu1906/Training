package com.example.demo.controllers;

import java.util.HashMap;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/catalogs")
public class CatalogController {
	
	@GetMapping
	public HashMap<String, String> getDetails(){
		HashMap<String , String> details = new HashMap<>();
		
		details.put("aaa", "Rs.18 per km");
		details.put("bbb", "Rs.14 per km");
		details.put("ccc", "Rs.10 per km");
		
		return details;
		
	}

}
