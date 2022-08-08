package com.training.model;

import java.util.List;

import com.training.Country;
import com.training.ifaces.CrudRepository;
import com.training.services.CountryServices;

public class Application {
	public static void print(List<Country> args) {
		for(Country eachCountry:args) {
			System.out.println(eachCountry);
		}
	}
	public static void main(String[] args) {
		Country c1=new Country("USA" , "kansasCity",501957);
		Country c2=new Country("India","Chennai",7090000);
		Country c3=new Country("USA","LosAngeles",3970000);
		Country c4=new Country("Nepal","kathmandu",1000000);
		Country c5=new Country("India","Kolkata",14900090);
		Country c6=new Country("USA","denver",706000);
		
		CrudRepository service=new CountryServices();
		System.out.println(service.add(c1));
		System.out.println(service.add(c2));
		System.out.println(service.add(c3));
		System.out.println(service.add(c4));
		System.out.println(service.add(c5));
		System.out.println(service.add(c6));
		
		
		System.out.println(service.findAll());
		System.out.println(service.findByPlace("USA"));
		System.out.println(service.findAll().iterator());
		System.out.println(service.findAll());
		System.out.println(service.findPopulation());

	}

}
