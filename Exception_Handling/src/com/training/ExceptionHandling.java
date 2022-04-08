package com.training;

public class ExceptionHandling {
	
	public void usingArrayIndexException(String[] args) {
	
			try {
				System.out.println(args[2]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Method requires three values to be passed[a,b,c]");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	public void usingNumberFormatException(String value) {
		int age=99;
		try {
			age = Integer.parseInt(value);
			System.out.println(age);
		} catch (NumberFormatException e) {
			System.out.println("Enter the value:");
			
			e.printStackTrace();
		}
		
		
	}
	public void usingFinallyBlock() {
		int denominator=0;
		try {
			System.out.println(4/denominator);
		}catch(ArithmeticException e) {
			System.out.println("Denominator should not be zero");
	}
		finally {
			System.out.println("Inside FINALLY===");
		}
		System.out.println("Thanks,bye bye");
	}


public String underStandFinallyBlock() throws Exception {
	int denominator=0;
	try {
		System.out.println(4/denominator);
	}catch(ArithmeticException e) {
		System.out.println("Denominator should not be zero");
		//return "welcome";
		throw new Exception();
  
	}
	finally {
		System.out.println("Inside FINALLY===");
	}
	System.out.println("Thanks,bye bye");
	return "thanks";
}}
