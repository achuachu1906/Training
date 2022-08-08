package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TripDetail;
import com.example.demo.service.TripDetailService;

@RestController
@RequestMapping(path="/api/v1/trips")
public class TripDetailController {
	

	
	
	@Autowired
	private TripDetailService service;
	
	@PostMapping
	public TripDetail add(@RequestBody TripDetail entity) {
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<TripDetail> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path = "/srch/driver/{driverId}")
	public List<TripDetail> findByDriverId(@PathVariable ("driverId") int id){
		return this.service.findByDriverId(id);
	}
	
}
