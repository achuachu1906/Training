package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepository;

@Service
public class BookService {
	
	private BookRepository repo;
	
    @Autowired
	public BookService(BookRepository repo) {
		super();
		this.repo = repo;
	}
    
	public List<Book> findAll(){
		return repo.findAll();
	}
	
    public Book save(Book entity) {
    	return repo.save(entity);
    }

    public Optional<Book> findById(int id){
    	return repo.findById(id);
    }

	public void deleteById(int id) {
	this.repo.deleteById(id);
	}
	

	  public int updatePrintedPrice(int id, double updatedPrintedPrice) {
			return this.repo.modifyPrintedPrice(id, updatedPrintedPrice);
}
	  public int updateDiscountPrice(int id, double updatedDiscountPrice) {
		return this.repo.modifyDiscountPrice(id, updatedDiscountPrice);
}   
	  public List<Book> findByBookTitle(String name) {
			
			return this.repo.findByBookTitle(name);
		}

	    

	
    
	
}
