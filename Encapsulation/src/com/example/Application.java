package com.example;

import com.example.model.Student;

public class Application {

	/**
	 * 
	 */
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student();
		
	//	ram.rollNumber=101;
		
	ram.setRollNumber(101);
	ram.setMarkScored(99);//unable to access application is not a sub class of student
	
	
	ram.setFirstName("Giant");//default method unable to access=>
	                         //because student class is in com.example.model.package
                             //and application is in com.example package
	ram.setMarkScored(89);
	System.out.println("Roll Number :" + ram.getRollNumber());
	System.out.println("Mark Scored :"+ram.getMarkScored());
    System.out.println("Student Name:"+ram.getFirstName());
     
    Student shyam=new Student(490,"Shyam",89,"mech");
    		
    		System.out.println("Roll Number:=" + shyam.getRollNumber());
            System.out.println("Student Name:=" +shyam.getFirstName());
	}

}
