package com.example;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class App {
	public static void main(String[]args) {
		String dateOfBirth = "1999-08-10";
		Student vicky=new Student();
		
		vicky.setRollNumber(200);
		vicky.setStudentName("Vignesh");
        vicky.setDateOfBirth(LocalDate.parse(dateOfBirth));
        vicky.setDateOfJoining(LocalDateTime.now());
        
        System.out.println("Year:="+vicky.getDateOfBirth().getYear());
        System.out.println("Month:="+vicky.getDateOfBirth().getMonth());
        System.out.println("Day:="+vicky.getDateOfBirth().getDayOfMonth());
        
        LocalTime startTime=LocalTime.of(9, 30);
        LocalTime endTime=startTime.plus(8,ChronoUnit.HOURS);
        System.out.println("Start Time:="+startTime);
        System.out.println("End Time:="+endTime); 
       
        
        
	}

}
