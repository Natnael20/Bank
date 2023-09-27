package com.github;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

	public double balance;
	public List<InterestRate> rate;
	public List<Transaction> transactionHistory;
	public List<CheckingsAccount> CheckingsAccount;
	public List<savingsAccount> savingsAccount;
	
	
	public BankAccount(double balance) {
		this.balance = balance;
		this.CheckingsAccount = new ArrayList<>();
		this.rate = new ArrayList<>();
		this.transactionHistory = new ArrayList<>();
		this.savingsAccount = new ArrayList<>();
	}

	public List<InterestRate> getRate() {
		return rate;
	}

	public List<CheckingsAccount> getCheckingsAccount() {
		return CheckingsAccount;
	}

	public List<savingsAccount> getSavingsAccount() {
		return savingsAccount;
	}

	public double getBalance() {
		return balance;
	}
	
	public void depsoit(double amount) {
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
		if(amount <= this.balance) {
			this.balance-=amount;
			Transaction transaction = new Transaction(amount,"Widthdraw");
			transactionHistory.add(transaction);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}

}
