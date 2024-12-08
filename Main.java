package com.banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(); // Bank to manage accounts

        System.out.println("Welcome to the Banking System!");

        // Prompt user for account type
        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        Banking_Operations account;
        if (choice == 1) {
            account = new SavingsAccount();
            System.out.println("Savings Account created!");
        } else if (choice == 2) {
            account = new CurrentAccount();
            System.out.println("Current Account created!");
        } else {
            System.out.println("Invalid choice. Exiting.");
            return;
        }

        // Add the account to the bank
        bank.addAccount(account);

        boolean exit = false;
        while (!exit) {
            // Display menu for operations
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1: // Deposit
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2: // Withdraw
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3: // View Balance
                    System.out.println("Current Balance: " + account.viewBalance());
                    break;

                case 4: // Exit
                    exit = true;
                    System.out.println("Exiting the Banking System. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
