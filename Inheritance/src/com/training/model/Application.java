package com.training.model;
import com.training.model.SavingsAccount;

public class Application {

	public static void main(String[] args) {
		
////		BankAccount account=new BankAccount(1010,"Ramesh",50000,"savings");
////		System.out.println(account.toString());
		
		
		SavingsAccount account=new SavingsAccount(650, "ramesh", 678, "joint","rajesh" );
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getNominee());
		System.out.println(account.getBalance());
		
		SavingsAccountService service=new SavingsAccountService();
		System.out.println(service.getCustomerInfo(account));
		System.out.println(service.calculateInterest(account));
		
		BankAccountService service2= new SavingsAccountService();
		//cannot access the sub classs method with super classs reference
		// service2.getCustomerInfo(account);
		
		SavingsAccountService savingService2=(SavingsAccountService)service2;
		BankAccountService sc2= new SavingsAccountService();
		System.out.println(savingService2.getCustomerInfo(account));
		
////
	}


}


