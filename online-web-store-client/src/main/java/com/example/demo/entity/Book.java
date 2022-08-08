package com.example.demo.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Book {
	

	int bookId;
	
	String author;
	
	String bookTitle;
	
	double printedPrice;
	
	double discountPrice;
	
	int publishedYear;
	
	String category;

}
