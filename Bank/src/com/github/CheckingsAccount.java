package com.github;

import java.util.ArrayList;
import java.util.List;

public class CheckingsAccount extends BankAccount {
	
	private double balance;
	private long accountNumber;
	private String accountHolder;
	public List<Transaction> transactionHistory;
	
	public CheckingsAccount(long accountNumber, String accountHolder,double rate,double balance) {
		super(balance);
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.transactionHistory = new ArrayList<>();
	}
	
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public List<Transaction> getTransactionHistory() {
		return transactionHistory;
	}
	
	public void deposit(double amount) {
		if(amount >= 0) {
			this.balance+=amount;
            Transaction transaction = new Transaction(amount, "Deposit");
			transactionHistory.add(transaction);
		}
		else {
			System.out.println("Abort transaction!");
		}
	}
	
	public void withdraw(double amount) {
	    if (amount <= this.balance) {
	        this.balance -= amount; // Subtract the withdrawal amount from the balance
	        Transaction transaction = new Transaction(-amount, "Withdraw"); // Use a negative amount for withdrawal
	        transactionHistory.add(transaction);
	    } else {
	        System.out.println("Insufficient balance");
	    }
	}

	
	
}
