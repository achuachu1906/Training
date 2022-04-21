package com.example;
import java.util.*;

import java.util.Set;
import java.util.TreeSet;
public class Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		 System.out.println("enter the elements:");
		 int n=sc.nextInt();
		 String[] str=new String[n];
		 System.out.println("Enter the String Elements:");
		 for(int i=0; i<n;i++) {
			 str[i]=sc.next();
			 FruitShop fruit=new FruitShop();
			 FruitShop.add(str);
			 sc.close();
		 }}
				 
		 