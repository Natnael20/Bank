package com.github;

import java.util.ArrayList;
import java.util.List;

public class savingsAccount extends BankAccount {
	
	private Long accountNumber;
	private String accountHolder;
	private List<Transaction> transactionHistory;
	
	public savingsAccount(long accountNumber, String accountHolder,double rate,double balance) {
		super(balance);
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.transactionHistory = new ArrayList<>();
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
	
	@Override
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
	
	@Override
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
