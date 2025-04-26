/*
Project: The Account Class

Problem Description:
(The Account class) Design a class named Account that contains:
• A private int data field named id for the account (default 0).
• A private double data field named balance for the account (default 0).
• A private double data field named annualInterestRate that stores the current 
interest rate (default 0). Assume all accounts have the same interest rate.
• A private Date data field named dateCreated that stores the date when the account was created.
• A no-arg constructor that creates a default account.
• A constructor that creates an account with the specified id and initial balance.
• The accessor and mutator methods for id, balance, and annualInterestRate.
• The accessor method for dateCreated.
• A method named getMonthlyInterestRate() that returns the monthly interest rate.
• A method named withdraw that withdraws a specified amount from the account.
• A method named deposit that deposits a specified amount to the account

Draw the UML diagram for the class. Implement the class. Write a test program that 
creates an Account object with an account ID of 1122, a balance of $20,000, and an 
annual interest rate of 4.5%. Use the withdraw method to withdraw $2,500, use the
deposit method to deposit $3,000, and print the balance, the monthly interest, and 
the date when this account was created.
 */

import java.util.Date;

public class Exercise_09_07 {

    public static void main(String[] args){
        // create an Account object with an account
        // ID of 1122, and balance of $20,000
        Account account = new Account(1122, 20000);

        // Set annual interest rate to 4.5%
        account.setAnnualInterestRate(4.5);

        // Withdraw $2,500
        account.withdraw(2500);

        // Deposit $3,000
        account.deposit(3000);

        // Display the balance, the monthly interest, 
		// and the date when this account was created
		System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", 
			account.getMonthlyInterest());
    }
}

// implement the account class
class Account {
    // Private fields
    private int id;
    private double balance;
    private double annualInterestRate; // Annual interest rate in percentage
    private Date dateCreated;

    // No-arg constructor
    public Account() {
        this(0, 0); // Default id and balance
    }

    // Constructor with id and balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date(); // Set the account creation date to the current date
    }

    // Accessor methods (getters)
    // Return id
    public int getId() {
        return id;
    }

    // Return balance
    public double getBalance() {
        return balance;
    }

    // Return annual interest rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Return date created
    public Date getDateCreated() {
        return dateCreated;
    }

    // Mutator methods (setters)
    // Set id
    public void setId(int id) {
        this.id = id;
    }

    // Set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Set annual Interest Rate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Method to return the monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100; // Convert annual rate to monthly rate
    }

    // Method to calculate and return the monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Method to withdraw a specified amount (decrease balance by amount)
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Method to deposit a specified amount (increase balance by amount)
    public void deposit(double amount) {
        balance += amount;
    }
}