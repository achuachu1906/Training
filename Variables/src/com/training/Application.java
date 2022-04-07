package com.training;

public class Application {
	public static void main(String[]args) {
		
	BankAccount account2 = new BankAccount("Ramesh",1000);

	System.out.println(account2.getUpdateBalance(2000));
	
	System.out.println(account2.getUpdateBalance(2000));
	
	System.out.println(account2.getAccountHolderName());
	
	
}
}