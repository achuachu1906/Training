package com.training;

import java.io.File;

import com.training.model.Book;
import com.training.model.services.BookService;

public class AppForStreams {
	public static void main(String[] args) {
		Book book =new Book(123,"Oracle","Achu",560);
		BookService service=new BookService();
		File file=new File("book.ser");
		int ch=2;
		if(ch==1) {
			
		//Book book =new Book(123,"Oracle","Achu",560);
		
		boolean result=service.writeToStream(file, book);
		if(result) {
			System.out.println("One Record Serialized");
		}	
		
	}else {
		Book fromFile=(Book) service.readFromStream(file);
		System.out.println(fromFile.getBookName());
		System.out.println(fromFile);
	}

}
}