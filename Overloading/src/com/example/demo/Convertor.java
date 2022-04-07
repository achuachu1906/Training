package com.example.demo;

public class Convertor {
	
	public String convert(String str) {
		
		return str.toUpperCase();
		
	}
	
	

	//Creating a overload MEthod
	
	public double convert(double farenTemp) {
		return(farenTemp-32)*5/9;
	}


public double convert(double amt,int frm) {
	
	double response=amt*100;
	
	if(frm>1) {
		response = amt*100;
	}
	
		return response;
	
}
}