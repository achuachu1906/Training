package com.training;

import java.util.*;
import java.util.List;


public class person{
	

     

//public class Test {
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,56,22,78);
		
	//System.out.println(numbers.indexOf(22));
		
		      numbers.stream().filter(e-> e %2 == 0).forEach(System.out::println);
		      
		      
//		 List<Person> list = Arrays.asList(new Person(101,"ravi",98600),
//				 new Person(new Person(102,"ram",96500)));
//		      
	}

}