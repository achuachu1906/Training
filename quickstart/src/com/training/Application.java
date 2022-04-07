package com.training;

public class Application {
	
		
	

	public static void main(String[] args) {
		Greetings grtObj=new Greetings();
		
		//System s =new System();  (The constructor of the s\m is private)
		
		System.out.println(grtObj.getMessage());
		System.out.println(Greetings.getInfo());
		
	}

}
