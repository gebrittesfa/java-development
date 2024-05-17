package com.pluralsight;

public class BankAccount {
    private static double interestRate;
    private String number;
    private String name;
    private double balance;

    public static double getInterestRate() {
        return interestRate;
    }

    public BankAccount(String number, String name,
                       double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public static void bankName(String gebritBank) {
    }

    public double getBalance() {
        return balance + (balance*interestRate);
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
}

