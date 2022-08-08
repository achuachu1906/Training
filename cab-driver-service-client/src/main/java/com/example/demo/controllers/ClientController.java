package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.TripDTO;
import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDetail;

@RestController
@RequestMapping(path= "/client" )
public class ClientController {
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private TripDTO dto;
	
	
	@GetMapping(path= "/drivers")
	public String getDrivers() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers", String.class);
	}
	
	@GetMapping(path= "/drivers/json")
	public CabDriver[] getDriverAsJson() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers", CabDriver[].class);
	}
	
	@GetMapping(path="/drivers/srch/{name}")
	public String getDriversByName(@PathVariable("name") String name) {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/srch/"+name,String.class);
	}
	
	@GetMapping(path="/trips")
	public String gettrips() {
		return this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/trips/",String.class);
	}
//	   @GetMapping(path = "/driver/trips/{id}")
//	 	public TripDTO getDriverTrips(@PathVariable("id")int id) {
//	 		
//	 		CabDriver driver= this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id,CabDriver.class);
//	 		
//	 		TripDetail[] trips= this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/trips/srch/driver/"+id,TripDetail[].class);
//	 		
//	 		dto.setDriver(driver);
//	 		dto.setDriver(driver);
//			List<TripDetail> detailSet = Arrays.asList(trips);
//			dto.setTrips(detailSet);
//	   }
//	   
	 
	   
	   @GetMapping(path = "/driver/trips/{id}")
	 	public String getDriverTrips(@PathVariable("id")int id) {
	 		
	 		String driver= this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id,String.class);
	 		
	 		String trips= this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/trips/srch/driver/"+id,String.class);
	 		
	 		return driver+trips;
	 		}
	  
	   
	   
	   @GetMapping(path = "/driver/trips/json/{id}")
		public 
		TripDTO getDriverTrip(@PathVariable("id")int id) {
			
			CabDriver driver=this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id,CabDriver.class);
					
			TripDetail[] trips=this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/trips/srch/driver/"+id,TripDetail[].class);	
			
			dto.setDriver(driver);
			List<TripDetail> detailSet = Arrays.asList(trips);
			dto.setTrips(detailSet);
			
			return dto;
		
		}
}
