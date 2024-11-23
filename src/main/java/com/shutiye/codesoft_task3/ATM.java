package com.shutiye.codesoft_task3;

import java.util.Scanner;

public class ATM {
    private BankAccount account;
    private Scanner scanner = new Scanner(System.in);

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {
        int choice;
        do {
            System.out.println("ATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
                    System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void withdraw() {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient alance.");
        }
    }

    private void deposit() {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);  

        System.out.println("Deposit successful.");
    }

    private void checkBalance() {
        System.out.println("Your balance is: $" + account.getBalance());  

    }
}