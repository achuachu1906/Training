package com.training.services;

import java.util.Optional;

public class UsingOptional {
	public static Optional<String> getValue(int key){
		Optional<String> response = Optional.empty();
		if(key==1) {
			response = Optional.of("Hi");
		}return response;
		}
		public static Object getString(int key) {
		switch (key) {
		case 1:
			return new String("chocobar");
		case 2:
			return new String("cassatta");
			

		default:
			return null;
		}
	}
	public static void main(String[]args) {
		//will throw null pointer exception
		//System.out.println(getString(3).toString());
		System.out.println(getString(2).toString());
		//to avoid null pointer exception and return a default value
		//new feature of Java 8 optional is used
		
		Optional<Object> optional = Optional.ofNullable(getString(2));
		System.out.println(optional.orElse("vannila").toString());
		
		//here we are checking if the value is present
		//it its present then only we will call get method
		Optional<Object> opt2 = Optional.ofNullable(getString(3));
		if(opt2.isPresent()) {
			System.out.println("Value is present"+ opt2.get());
		}else {
			System.out.println("Value is not present");
		}
		//using the lambda expression with optional
		//Optional<Object> opt3=Optional.ofNullable(getString(3));
		//opt3.orElseThrow(
		//		()-> new RuntimeException(
		//				"No Object For Value 3 Try again"));
	 Optional<String> opt4=getValue(1);
	 if(opt4.isPresent()) {
		 System.out.println(opt4.get().toString());
	 }else {
		 System.out.println("Invalid Choice Enter 1");
	 
}
}}