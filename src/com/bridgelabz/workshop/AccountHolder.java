package com.bridgelabz.workshop;

import java.util.Scanner;

public class AccountHolder {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount to deposit for saver1: ");
		double deposit = sc.nextDouble();
		SavingsAccount saver1 = new SavingsAccount(deposit);   // creating saver1 object

		
		System.out.print("Enter amount to deposit for saver2: ");
		deposit = sc.nextDouble();
		SavingsAccount saver2 = new SavingsAccount(deposit);		// creating saver2 object

		// setting the annual interest rate to 4% and calculating monthly interest for saver1 & saver2
		System.out.print("\nEnter annual interest rate : ");
		double interest = sc.nextInt();
		SavingsAccount.setAnnualInterestRate(interest);
		saver1.calculateMonthlyInterest();
		System.out.println("Saver1 balance after adding interest : "+saver1.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.println("Saver2 balance after adding interest : "+saver2.getSavingsBalance());

		// modifying the annual interest rate to 5% and calculating monthly interest for saver1 & saver2
		System.out.print("\nEnter annual interest rate : ");
		interest = sc.nextInt();
		SavingsAccount.modifyInterestRate(interest);
		saver1.calculateMonthlyInterest();
		System.out.println("Saver1 balance after adding interest : "+saver1.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.println("Saver2 balance after adding interest : "+saver2.getSavingsBalance());
		
		sc.close();

	}

}
