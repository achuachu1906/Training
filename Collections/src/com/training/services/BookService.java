package com.training.services;

import java.util.List;
import java.util.ArrayList;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookService implements CrudRepository {
	
	
	private ArrayList<Book> bookList;
      
	public BookService() {
		super();
		this.bookList=new ArrayList<>();
		}

	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book);
	}

	@Override
	public Book findById(int id) {
		Book found = null;
    for(Book eachBook:this.bookList) {
			if(eachBook.getBookNumber()==id) {
				found = eachBook;		
			}
			
		}
		return found;
		
	}

	@Override
	public boolean remove(Book book ) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public Book update(Book oldBook ,Book newBook) {
		if(this.bookList.contains(oldBook)) {
			//System.out.println("Inside IF BLOCK ######");
			int idxpos = this.bookList.indexOf(oldBook);
	}else {
		//System.out.println("Inside ELSE BLOCK #######");
		
	}
		return newBook;
	}
}

	
	