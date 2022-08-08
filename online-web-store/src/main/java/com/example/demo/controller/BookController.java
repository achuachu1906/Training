package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.services.BookService;


@RestController
@RequestMapping(path= "/api/v1/onlinebooks")
public class BookController {
  
	@Autowired
	public BookService service;
	
	
    @PostMapping
	public Book add(@RequestBody Book entity) {
		return this.service.save(entity);
	}
	@GetMapping
	public List<Book> findAll(){
		return this.service.findAll();
		 }
	
	@GetMapping(path= "/{id}")
	public Book findById(@PathVariable("id") int id) {
		return this.service.findById(id).orElseThrow(() -> new RuntimeException("Element Not Found"));
	}
	 @DeleteMapping(path = "/{id}")
	    public void deleteBookById(@PathVariable("id") int id) {
	    this.service.deleteById(id);
	}

	   @PutMapping(path = "/mrpupdate/{bookId}/{printedPrice}")
	   public int updateprintedPrice(@PathVariable("bookId")int id, @PathVariable("printedPrice")double updatedPrintedPrice){
	   	int update = this.service.updatePrintedPrice(id, updatedPrintedPrice);
	   	return update;
	   	
	   }
	   
	   @PutMapping(path = "/discount/{bookId}/{discountPrice}")
	   public String updatediscountPrice(@PathVariable("bookId")int id, @PathVariable("discountPrice")double updatedDiscountPrice){
	   	int update = this.service.updateDiscountPrice(id, updatedDiscountPrice);
	   	return "update";
	   	
	   }
	   @GetMapping(path="/srch/title/{bookTitle}")
		public List<Book> findByBookTitle(@PathVariable("bookTitle") String name) {
			 return this.service.findByBookTitle(name);
			
			
		}

}                                      