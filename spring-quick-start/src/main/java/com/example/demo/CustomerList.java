package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.Customer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
@AllArgsConstructor
@Getter

public class CustomerList {
 List<Customer> custList;
 
}