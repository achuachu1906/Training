package com.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.model.Student;

public class HashMap2 {

	public static void main(String[] args) {
		Student ram=new Student(101,"anand",78);
		Student shyam=new Student(102,"basky",68);
		Student mukesh=new Student(103,"mukesh",68);
		
		HashMap<Integer,Student> map=new HashMap<>();
		map.put(900, ram);
		map.put(902, shyam);
		map.put(904, mukesh);
		
		System.out.println(map.get(900));
		System.out.println(map.get(902));
		System.out.println(map.get(904));
		
		//to print all the values
		System.out.println("To get all the values========================:");
		Set<Integer> keys=map.keySet();
		for(Integer key: keys) {
			System.out.println(map.get(key));
		}
		Collection<Student> list = map.values();
		for(Student eachStudent:list)
			System.out.println(eachStudent);
		
		System.out.println("Both key and values===================:");
		Set<Map.Entry<Integer,Student>> list2 = map.entrySet();
		for(Map.Entry<Integer,Student>eachEntry : list2){
			
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
	}//forloop:

//String[] names={"Ram","shyam",Siva};
//for(String name:names){
//syso();}

//for loop for list:

//List<Student> StudList=new ArrayList<>();
//for(Student eachStudent:StudList){
//syso();}

}
