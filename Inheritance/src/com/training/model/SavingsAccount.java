package com.training.model;

public class SavingsAccount extends BankAccount {
	 private String nominee;
	 
	
	public String getNominee() {
		return nominee;
	}


	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	 public SavingsAccount() {
			super();
			}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
	}

	
		// TODO Auto-generated constructor stub
	}

	 
	 //whenever sub class consturctor is called its super class constructor also called.
	 //even if super() key word is not present.
//	 public SavingsAccount() {
//	 super();
//		 System.out.println("Constructor of SUB CLASS Called");
//	 }
//}	

//public SavingsAccount() {
//	super(1020,"ram",5000);
//	System.out.println("Constructor of SUB CLASS Called");
//}
//}
	 