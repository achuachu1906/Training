package com.training;

import com.training.exception.RangeCheckException;
import com.training.model.Student;
import com.training.services.StudentService;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		
	Student ram=null;
		try {
		ram = new Student(1010,"emi",-98);
	} catch (RangeCheckException e1) {
			
			e1.printStackTrace();
		}
		StudentService service=new StudentService(ram);
		System.out.println(service.sendDetails());
		
		StudentService service2=new StudentService(ram);
		try {
			System.out.println("Grade:="+service2.findRank());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		System.err.println("Name is not passed");
	}
		ExceptionHandling exHandling= new ExceptionHandling();
	exHandling.usingArrayIndexException(args);
	exHandling.usingNumberFormatException("45");
        exHandling.usingFinallyBlock();
        try {
			System.out.println(exHandling.underStandFinallyBlock());
		} catch (Exception e) {
			System.out.println("hi");
			e.printStackTrace();
		}
	
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println(num);
	}catch(Exception e) {
		e.printStackTrace();
	
	}
}
}