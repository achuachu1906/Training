package com.training;

import com.training.model.Customer;

public class loanApplication {
	private int applicationNumber;
	private Customer customer;
	private double loanAmount;
	
	public loanApplication(int applicationNumber, Customer customer, double loanAmount) {
		super();
		this.applicationNumber = applicationNumber;
		this.customer = customer;
		this.loanAmount = loanAmount;
	}
	public loanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(int applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "loanApplication [applicationNumber=" + applicationNumber + ", customer=" + customer + ", loanAmount="
				+ loanAmount + "]";
	}
	
	

}
