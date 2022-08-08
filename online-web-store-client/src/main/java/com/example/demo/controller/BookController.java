package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Book;



@RestController
@RequestMapping(path= "/clients")
public class BookController {

	@Autowired
	private RestTemplate template;
	
	@GetMapping(path="/books")
	public String getBooks() {
		return this.template.getForObject("http://BOOK-SERVICE/api/v1/onlinebooks", String.class);
	}
	@GetMapping(path= "/onlinebooks/json")
	public Book[] getBookAsJson() {
		return this.template.getForObject("http://BOOK-SERVICE/api/v1/onlinebooks", Book[].class);
	}

	@GetMapping(path="/onlinebooks/srch/title/{bookTitle}")
	public String getBookByTitle(@PathVariable("bookTitle") String bookTitle) {
		return this.template.getForObject("http://BOOK-SERVICE/api/v1/onlinebooks/srch/title/"+bookTitle,String.class);
	}
	
}                                