package com.training;

import java.util.*;

import com.training.model.BankAccount;
import com.training.services.BankAccountService;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     BankAccountService service=new BankAccountService();
     BankAccount[] list = new BankAccount[3];
     Scanner sc=new Scanner(System.in);
     int idx = 0;
     int choice =0;
     
	  BankAccount[] bank = null;
	do {
    	
    	 System.out.println("Enter accountNumber:");
    	 int accountNumber=sc.nextInt();
    	 
    	 
    	 System.out.println("Enter accountHolderName:");
    	 String accountHolderName = sc.next();
    	 
    	
    	 System.out.println("Enter the balance");
    	 double balance=sc.nextDouble();
    	 
    	 
    	 System.out.println("Account Type[savings,fixed,recurring]");
    	 String accountType=sc.next();
    	 
    	 BankAccount account=new BankAccount(accountNumber,accountHolderName,balance,accountType);
		list[idx]=account;
		 System.out.println("Enter 0 to end and 1 to continue:");
		choice=sc.nextInt();
		
     }
     while(choice==1);
	double[] values=service.findInterestByAccountType(list);
	for (double eachValue:values)
	{
		System.out.println(eachValue);
	}
     sc.close();
	}

}
