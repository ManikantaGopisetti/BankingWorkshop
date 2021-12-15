package com.bridgelabz.workshop;

public class SavingsAccount {

	public static double annualInterestRate;

	private double savingsBalance;
	
	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate/100;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}

	//initializing the Savings balance to the current account holder
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	// calculating monthly interest rate and adding it to savings balance
	public void calculateMonthlyInterest() {
		double monthlyInterest = (savingsBalance * annualInterestRate) / 12;   // calculating monthly interest
		savingsBalance = savingsBalance + monthlyInterest;					   //Adding monthly interest to savings balance 
	}

	// modifying the annual interest rate
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate / 100;
	}
		
}
