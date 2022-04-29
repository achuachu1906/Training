package com.training.model;

public class Customer {
	private int customerId;
	private String customer;
	private long phoneNumber;
	private double creditScore;
	public Customer(int customerId, String customer, long phoneNumber, double creditScore) {
		super();
		this.customerId = customerId;
		this.customer = customer;
		this.phoneNumber = phoneNumber;
		this.creditScore = creditScore;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(double creditScore) {
		this.creditScore = creditScore;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customer=" + customer + ", phoneNumber=" + phoneNumber
				+ ", creditScore=" + creditScore + "]";
	}
	
}