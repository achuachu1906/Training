package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;
import com.training.utils.BookNameComparator;

public class App {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Ram");
		names.add("Arch");
		names.add("chan");
		names.add("navi");
		names.add("pavan");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		
		Book java= new Book(101,"java","suba",450);
		Book spring=new Book(102,"spring","mad",650);
		Book maven=new Book(103,"Maven","Harish",550);
		Book html=new Book(104,"Html","priya",1450);
		Book python=new Book(105,"python","Sathya",850);
		
		CrudRepository service=new BookService();	
		
		 System.out.println("Is Added:="+service.add(java));
 		 System.out.println("Is Added:="+service.add(spring));
		 System.out.println("Is Added:="+service.add(maven));
		 System.out.println("Is Added:="+ service.add(html));
		 System.out.println("Is Added:="+service.add(python));
		 List<Book> bookList=service.findAll();
		 Collections.sort(bookList);
		 System.out.println(bookList);
		 Collections.sort(bookList, new BookNameComparator());
		 System.out.println("Sort By Book Name");
		 System.out.println(bookList);
}

	
}