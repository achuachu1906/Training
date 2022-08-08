package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Driver;
import com.example.demo.repo.DriverRepository;

@Service
public class DriverService {
	

	private DriverRepository repo;
	
	@Autowired
	public DriverService(DriverRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Driver> findAll() {
		return this.repo.findAll();
	}

	public Driver addDriver(Driver entity) {
		return this.repo.save(entity);
	}
	
	public Driver findById(int id) {
		return this.repo.findById(id).orElseThrow( ()-> new RuntimeException(id+ "Not Found"));

	}

	public Driver add(Driver entity) {
		return this.repo.save(entity);
	}
	
	public void deleteById(int id) {
	this.repo.deleteById(id);
	}
	
	public List<Driver> findByDriverName(String srchName){
		return this.repo.findByDriverName(srchName);
	}
	public List<Driver> srchByMobileNumber(long number){
		return this.repo.findByMobileNumber(number);
	}
	public List<Driver> srchByDriverRating(double rating){
		return this.repo.searchByRating(rating);
	}
	public int updateRating(int driverId ,double updateRating) {
		return this.repo.modifyRating(driverId,updateRating);
	}
  
	
}
