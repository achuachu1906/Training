package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.services.DriverService;

@RestController
@RequestMapping(path="/api/v1")

public class DriverController {

	
	private DriverService service;

	@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
	@GetMapping(path ="/drivers")
	public List<Driver> getAllDrivers(){
		return this.service.findAll();
				
	}
	@GetMapping(path="/drivers/{id}")
	public Driver getDriverById(@PathVariable("id") int id) {
		return this.service.findById(id);
	}
	
	@GetMapping(path = "/drivers/srch/name/{driverName}")
	public List<Driver> getDriverName(@PathVariable("driverName") String srchName){
		return this.service.findByDriverName(srchName);
	}
	
	@GetMapping(path = "/drivers/srch/mobile/{mobileNumber}")
	public List<Driver> getDriverByMobileNumber(@PathVariable("mobileNumber") long number){
		return this.service.srchByMobileNumber(number);
	}
	
	@GetMapping(path = "/drivers/srch/rating/{rating}")
	public List<Driver> getByDriverRating(@PathVariable("rating") double rating){
		return this.service.srchByDriverRating(rating);
	}
	@PutMapping(path="/drivers/update/{id}/{rating}")
	 public ResponseEntity<Object>updateRating (@PathVariable("id")int id,@PathVariable("rating")double updateRating){
		
		int rowUpdated=this.service.updateRating(id,updateRating);
		if(rowUpdated!=0) {
			return ResponseEntity.status(200).build();
					
		}else {

			return ResponseEntity.ok("not updated");

		}
	}
	@PostMapping(path="/drivers")
	public ResponseEntity<Driver>addDriver(@RequestBody Driver entity) {
		Driver driver=this.service.add(entity);
		URI locations=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getDriverId()).toUri();
		return ResponseEntity.created(locations).body(driver);

	}

    @DeleteMapping(path = "/drivers/{id}")
    public void deleteDriverById(@PathVariable("id") int id) {
    this.service.deleteById(id);
}
}
