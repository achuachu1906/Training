package com.training.Maven_Project2;

public class Book {
	private String bookName;
	private double bookprice;
	public Book(String bookName, double bookprice) {
		super();
		this.bookName = bookName;
		this.bookprice = bookprice;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookprice=" + bookprice + "]";
	}
	
	

}
