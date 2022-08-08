package com.example.demo;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import com.example.demo.model.Driver;

@Component
public class Client {
	
	String BASEURL = "http://localhost:8080/api/v1/users";
	private RestTemplate template;
	
    @Autowired
	public Client(RestTemplate template) {
		super();
		this.template = template;
	}
    
    public String invokeGetAll() {
    	return template.getForObject(BASEURL, String.class);
    	}
    
    public Driver[] invokeAllAsObject() {
    	return template.getForObject(BASEURL,Driver[].class);
    }
    
    public void add() {
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		int driverid;
		String driverName;
		long mobileNumber;
		double rating;
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("driverId", 20);
		map.put("driverName", "Ashu");
		map.put("mobileNumber", 98745);
		map.put("rating", 2.0);
		
		HttpEntity<Map<String,Object>> entity = new HttpEntity(map,header);
		 
		 ResponseEntity<Driver> resp = this.template.postForEntity(BASEURL, entity, Driver.class);

		 System.out.println("Status :"+resp.getStatusCodeValue());
		 System.out.println("Body :"+resp.getBody());
		 System.out.println("Location :"+resp.getHeaders().get("Location"));
		
	
    }
}
