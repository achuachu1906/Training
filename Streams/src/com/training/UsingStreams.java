package com.training;

import java.util.*;
import com.training.model.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;


public class UsingStreams {
	
	//problem1
	public static void useDistinct(List<Book> bookList) {
		bookList.stream().distinct().forEach(System.out::println);
		
	}
	
	//problem2
	public static void collectToSet(List<Book> bookList) {
		Set<Book> bookSet=
				bookList.stream()
				.filter(e->e.getPrice()>900)
				.collect(toSet());
		
		bookSet.forEach(System.out::println);
	}
	
	//problem3
	public static void collectToMap(List<Book> bookList) {
		
		Map<String,Double> values=bookList.stream()
				.filter(e->e.getPrice()>500).distinct()
				.collect(toMap(Book::getBookName,Book::getPrice));
		values.forEach((key,value)->System.out.println(key + ","+value));
	}
      //problem 4
	public static void  findMaxPrice(List<Book> bookList) {
		Optional<Book> optional=bookList.stream().max( Comparator.comparing(Book::getPrice) );
		if(optional.isPresent()) {
			System.out.println("Maximum Price:=" +optional.get().getPrice());
		}}
	//problem 5
		public static void  findMinPrice(List<Book> bookList) {
			Optional<Book> optional=bookList.stream().min( Comparator.comparing(Book::getPrice) );
			if(optional.isPresent()) {
				System.out.println("Minimum Price:=" +optional.get().getPrice());
			}
					
	}//problem 6
		
	public static void count(List<Book> bookList) {
		long count=bookList.stream().filter(e->e.getBookName().contains("z")).count();
		System.out.println("Count:"+ count);
	}
	
	public static void main(String[] args) {
		
Book java = new Book(101, "java", "subha", 450);
Book spring = new Book(102, "Spring", "Mad", 650);
Book maven = new Book(103, "Maven", "Harish", 550);
Book html = new Book(104, "html", "Priya", 1450);
Book python = new Book(105, "Python", "Sathya", 850);
Book mavenNew = new Book(104, "html", "Priya", 1450);
Book pythonNew = new Book(105, "Python", "Sathya", 850);
//here maveNew and pythonNew contains equal arguments comparing to html and python 
//so the problem statement is we need to get the all the objects 
//except the duplicate objects

List<Book> bookList=Arrays.asList(java,spring,maven,html,python,mavenNew,pythonNew);
useDistinct(bookList);
System.out.println("***************************************");

//in order to get so we once completing the code we need to go back and put 
//hashcode and equals method in book class in order to check for equality
	
int key=1;
switch (key) {
case 1:
	useDistinct(bookList);
	break;
case 2:
	collectToSet(bookList);
case 3:
	collectToMap(bookList);
case 4:
    findMaxPrice(bookList);
case 5:
	findMinPrice(bookList);

default:
	break;
}

collectToSet(bookList);
System.out.println("***************************************");

collectToMap(bookList);
System.out.println("***************");

findMaxPrice(bookList);
System.out.println("##############################################");

findMinPrice(bookList);
System.out.println("####################");

count(bookList);
System.out.println("+++++++++++++");



		

	}

}