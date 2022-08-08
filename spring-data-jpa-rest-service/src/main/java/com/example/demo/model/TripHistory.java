package com.example.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "achu_trip_history")
public class TripHistory {

	@Id
	@Column(name = "trip_Id")
	private int tripId;
	
	@Column(name = "trip_Date_Time")
	@DateTimeFormat(iso=ISO.DATE_TIME)
	private LocalDateTime tripDateTime;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "amount")
	private double amount;
}
