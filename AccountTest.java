package com.bridgelabz.oops;

public class AccountTest {
	
	    public static void main(String[] args) {
	        Account account = new Account(100.0);
	        System.out.println("Account Balance" +account.getBalance());

	        // test debit with valid amount
	        account.debit(50.0);
	        System.out.println("Account balance after debit: " + account.getBalance());

	        // test debit with invalid amount
	        account.debit(200.0);
	        System.out.println("Account balance after invalid debit: " + account.getBalance());
	    }
	}

