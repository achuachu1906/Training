package com.example;
import java.util.*;
import java.sql.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class WorkingWithDifferentDateClasses {

	public static void main(String[] args) {
		
		java.util.Date date1=new java.util.Date();//creating util date
		System.out.println(date1);
		System.out.println(date1.getTime());//millisec value of time
		
		java.sql.Date date2=new java.sql.Date(date1.getTime());//util date to sql date
		System.out.println(date2);
		
		LocalDate localDate=date2.toLocalDate();//sql date to local date
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getMonth());
		
		java.sql.Date sqlDate2=java.sql.Date.valueOf(localDate);//local date to sql date
		System.out.println("SQL Date 2:="+sqlDate2);

	}

}
