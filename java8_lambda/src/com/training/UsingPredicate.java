package com.training;
import java.util.function.*;
import java.util.*;

public class UsingPredicate {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("India","Srilanka","Indonesia","Bhutan");
		Predicate<String> containsChar = (country)->country.toUpperCase().startsWith("I");
		
		Consumer<String>consumer=(value)->{
			  if(containsChar.test(value)) {
			 System.out.println(value);
		 }
		 };//in lambda expression....if we have one method inside the body means curly braces in not neccessary..it be optional
		 //more than one method means curly braces is neccessary...
			 
		 names.forEach(consumer);
		 // same as above
		 		 //names.forEach((value)->System.out.println(value));
	}

}
