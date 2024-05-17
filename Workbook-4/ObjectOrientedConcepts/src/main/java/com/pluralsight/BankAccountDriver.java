package com.pluralsight;


public class BankAccountDriver {

    public static void main(String[] args) {
        double PI = Math.PI;
        // The interest rate on saving is 0.05
        //set the interest rate
        BankAccount.setInterestRate(0.05);
        BankAccount bankAccount = new BankAccount("s01","Saving",25000);
        BankAccount bankAccount1 = new BankAccount("s02","Saving",34000);
        bankAccount1.deposit(1000);
        bankAccount1.deposit(400);
        bankAccount1.withdraw(20000);
        bankAccount1.withdraw(5000);
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount1.getBalance());
        BankAccount.bankName("Gebrit Bank");


    }
}
