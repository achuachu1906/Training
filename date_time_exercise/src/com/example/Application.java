package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
	
		Student ram=new Student(101, "Ram", LocalDate.of(1972, 10, 12),LocalDateTime.of(2000, Month.JUNE,5,9,30));
		Student shyam=new Student(102, "Shyam", LocalDate.now(),LocalDateTime.now());
		
		System.out.println("Rams Year Of Birth:"+ram.getDateOfBirth().getYear());
		System.out.println("Rams First Birthday:"+ram.getDateOfBirth().plus(1,ChronoUnit.YEARS));
		System.out.println("Shyams Year Of Birth:"+shyam.getDateOfBirth().getYear());
		System.out.println("Shyams Sixtyth Birthday:"+shyam.getDateOfBirth().plus(60, ChronoUnit.YEARS));
		System.out.println("Shyam Previous Birthday:"+shyam.getDateOfBirth().minus(2, ChronoUnit.MONTHS));
	}

}
