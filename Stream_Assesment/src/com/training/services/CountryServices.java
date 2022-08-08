package com.training.services;

import java.util.ArrayList;
import com.training.Country;
import com.training.ifaces.CrudRepository;

public class CountryServices implements CrudRepository {
	
    private ArrayList<Country> countryList;


	public CountryServices() {
		super();
	}

	@Override
	public Country findByPlace(String Place) {
		Country found=null;
		for (Country eachCountry:this.countryList) {
			if(eachCountry.getCountry()==Place) {
				found=eachCountry;
				
			}
		}
		return found;
	}

	
	@Override
	public Country findAll() {
		Country found=null;
		for(Country eachCountry:this.countryList) {
			if(eachCountry.getCountry() != null) {
				found=eachCountry;
			}
		}
		return found;
	}

	@Override
	public Country add(Country con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country findPopulation() {
		// TODO Auto-generated method stub
		return null;
	}

}
