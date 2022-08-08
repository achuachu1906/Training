package com.example.demo.entity;

import java.time.LocalDate;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)

public class CabDriver {
	
	
	int driverId;
	String driverName;
	long mobileNumber;
	String location;
	
	@DateTimeFormat(iso = ISO.DATE) //yy.mm.dd(date format)
	LocalDate dateOfBirth;
	
	double rating;
	

}
