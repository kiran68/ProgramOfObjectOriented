package com.bridgelabz.oops;

public class Account {

	    private double balance;

	    public Account(double initialBalance) {
	        balance = initialBalance;
	    }

	    public void credit(double amount) {
	        balance += amount;
	    }

	    public void debit(double amount) {
	        if (amount > balance) {
	            System.out.println("Debit amount exceeded account balance.");
	        } else {
	            balance -= amount;
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	    
	    
	}


