package com.example.demo;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name");
		
		String name = sc.next();
		
		System.out.println("Enter teh Farenheit Temp");
		
		double farenTemp=sc.nextDouble();
		
		 Convertor convObj =new Convertor();
		
		System.out.println(convObj.convert(name));
		
		System.out.println("Celsius Temp:="+convObj.convert(farenTemp));
		
		System.out.println("Enter the amount");
		
		double amount = sc.nextDouble();
	
		System.out.println("Enter the Current amount to Convert 1-USD 2-EURO");
		int frm=sc.nextInt();
		
		System.out.println(convObj.convert(amount,frm));
		
        sc.close();
	}

}
