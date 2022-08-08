package com.example.demo.ifaces;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Passenger;


public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
 public List<Passenger> findByPassengerName(String name);
 public List<Passenger> findByTripHistoryListTripDateTime(LocalDateTime datetime);
 
}
