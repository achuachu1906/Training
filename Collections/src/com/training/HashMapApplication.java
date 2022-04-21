package com.training;
import java.util.*;

import com.training.model.Student;

public class HashMapApplication {

	public static void main(String[] args) {
		
		Student ram=new Student(101,"anand",78);
		Student shyam=new Student(102,"basky",68);
		Student mukesh=new Student(103,"mukesh",68);
		
		HashMap<Integer,Student> map=new HashMap<>();
		
		System.out.println(map.put(900, ram)); //put->null...becoz only assigning value
		System.out.println(map.put(901, shyam));
		System.out.println(map.put(902, mukesh));
		
		Student added = map.put(902, mukesh);
		if(added!=null) {
			map.put(904,added);
		}
		
		System.out.println(map.get(900));
		System.out.println(map.get(901));
		System.out.println(map.get(904));
}}
