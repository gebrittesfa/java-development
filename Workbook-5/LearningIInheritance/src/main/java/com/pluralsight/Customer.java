package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer {
    private String customerId;
    private int creditRating;

    private ArrayList<BankAccount> bankAccount;

    public Customer(int customerId, String firstName, String lastName, LocalDate birthDate, int creditRating) {
        //super(firstName, lastName, birthDate);
       // this.customerId = customerId;
        this.creditRating = creditRating;
    }

    public void calculateCreditRating(){

    }

    public void addAccount(BankAccount account){
        bankAccount.add(account);
        Animal animal = new Animal();
        animal.name="Customer animal";
        animal.name1="Testing";
    }
}
