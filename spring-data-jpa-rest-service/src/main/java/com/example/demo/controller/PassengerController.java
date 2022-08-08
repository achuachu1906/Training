package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Passenger;
import com.example.demo.model.TripHistory;
import com.example.demo.services.PassengerService;
@RestController
@RequestMapping(path = "api/v1")
public class PassengerController {

	private PassengerService service;
	@Autowired
	public PassengerController(PassengerService service) {
		super();
		this.service = service;
	}
	@GetMapping(path = "/passengers")
	public List<Passenger> getAllPassengers(){
	return this.service.findAll();	
}
	@PostMapping(path = "/passengers")
	public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger entity){
		Passenger pass = service.addPassenger(entity);
		return ResponseEntity.ok(pass);
	}
	@GetMapping(path ="/passengers/srch/name/{passengerName}")
	public List<Passenger> getPassengerByName(@PathVariable("passengerName")String srchName){
		return this.service.findByPassengerName(srchName);
	}

	@GetMapping(path = "/passengers/srch/date/{tripDateTime}")
	public List<Passenger> getPassengerByTripDateTime(@PathVariable("tripDateTime")@DateTimeFormat(iso=ISO.DATE_TIME) LocalDateTime datetime){
		return this.service.findByTripHistoryListTripDateTime(datetime);
	}
}

