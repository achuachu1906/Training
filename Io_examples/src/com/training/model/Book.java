package com.training.model;

import java.io.Serializable;

public class Book implements Comparable<Book> , Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID =2022L;
	private int bookNumber;
	private String bookName;
	private String author;
	private double price;
	private double discount;
	
	
	public Book(int bookNumber, String bookName, String author, double price, double discount) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.discount = discount;
	}


	public Book() {
		super();

	}


	public Book(int bookNumber, String bookName, String author, double price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}


	public int getBookNumber() {
		return bookNumber;
	}


	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	@Override
	public String toString() {
		return bookNumber + ","+ bookName + "," + author + "," + price;
			
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public int compareTo(Book otherObj) {
	if(otherObj.bookNumber<this.bookNumber) return -1;
	if(otherObj.bookNumber>this.bookNumber) return 1;
		return 0;
		//return otherObj.bookName.compareTo(this.bookName);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + bookNumber;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (bookNumber != other.bookNumber)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
    
}
