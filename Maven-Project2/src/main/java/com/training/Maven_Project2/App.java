package com.training.Maven_Project2;

public class App
{
	public static void main(String[] args) {
		Book  boo=new Book("arch",500.00);
		System.out.println("BookName:="+boo.getBookName());
		System.out.println("BookPrice:="+boo.getBookprice());
	}
}