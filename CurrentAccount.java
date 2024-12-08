package com.banking;

public class CurrentAccount implements Banking_Operations {
    private double balance;

    public CurrentAccount() {
        this.balance = 0.0;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    
    public double viewBalance() {
        return balance;
    }
}
