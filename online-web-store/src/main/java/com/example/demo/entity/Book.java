package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Table(name="achu_bookservice")
@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Book {
	
	@Id
	@Column(name="book_id")
	int bookId;
	
	@Column(name="author")
	String author;
	
	@Column(name="book_title")
	String bookTitle;
	
	@Column(name="printed_price")
	double printedPrice;
	
	@Column(name="discount_price")
	double discountPrice;
	
	@Column(name="published_year")
	int publishedYear;
	
	@Column(name="category")
	String category;

}
