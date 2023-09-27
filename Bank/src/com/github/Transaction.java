package com.github;

import java.util.Date;

public class Transaction {
	
	private Date date;
	private double amount;
	private String description;
	
	public Transaction(double amount, String description) {
		this.date = new Date();
		this.amount = amount;
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}
	
	
	

}
