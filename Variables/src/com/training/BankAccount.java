package com.training;

public class BankAccount {

	private static int count; //static variable
	
	private String accountHolderName; //instance variable
	
	private double balance; //instance variable
	
	private int accountNumber;
	
	public static int getCount() { //static method
		return count++;
		
	} //instance method
	public double getUpdateBalance(double amount) { //parameter variable
		
		double updatedBalance; //local  variable should be initialized before using
		double currentBalance=0;
		
		
		
		//System.out.println(updatedBalance);
		
		this.balance=this.balance+amount;
		
		 return this.balance;
		
		
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public BankAccount(String accountHolderName, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber=getCount();
	}
	
}
