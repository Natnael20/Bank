package com.github;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankAccount BankAccount = new BankAccount(10000.0);

        // Create a CheckingsAccount instance
        CheckingsAccount checkingAccount1 = new CheckingsAccount(123456789, "John Doe", 0.02, 1000.0);
        
        // Deposit and withdraw from the checking account
        checkingAccount1.deposit(1000);
        checkingAccount1.deposit(5000);
        checkingAccount1.withdraw(500);
        // Access transaction history
        List<Transaction> checkingTransactions = checkingAccount1.getTransactionHistory();

        // Print account details and transaction history
        System.out.println("Account Holder: " + checkingAccount1.getAccountHolder());
        System.out.println("Account Number: " + checkingAccount1.getAccountNumber());
        System.out.println("Balance: " + checkingAccount1.getBalance());

        
                
        System.out.println("Transaction History:");
        for (Transaction transaction : checkingTransactions) {
            System.out.println("Description: " + transaction.getDescription());
            System.out.println("Amount: " + transaction.getAmount());
            System.out.println();
        }
        
        // Access and print the current balance
        double currentBalance = checkingAccount1.getBalance();
        System.out.println("Current Balance: " + currentBalance);
                
        // Add the checking account to the list in the BankAccount instance
        BankAccount.getCheckingsAccount().add(checkingAccount1);
        
        
	}

}
