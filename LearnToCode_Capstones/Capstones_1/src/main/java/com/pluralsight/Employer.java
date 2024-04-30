package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Employer {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Transaction> ledger = new ArrayList<>();
    static ArrayList<Transaction> transaction = new ArrayList<>();

    public static void main(String[] args) {
        //Method to display home Screen options
        System.out.println("Welcome to the Transaction Management System!");
        System.out.println("Choose an option: ");
        System.out.println("D) Add Deposit");
        System.out.println("P) Make Payment (Debit)");
        System.out.println("L) Ledger (Display Ledger Screen)");
        System.out.println("X) Exit");

        // get user input
        String option = input.nextLine();
        switch (option) {
            case "D":
                addDeposit();
                break;
            case "P":
                makePayment();
                break;
            case "L":
                displayLedger();
                break;
            case "R":
                runReport();
                break;
            case "X":
                exitApplication();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    // Method to add deposit
    private static void addDeposit() {
        System.out.println("You chose to make a payment.");
        System.out.println(" Date (YYYY-MM-dd: ");
        LocalDate date = LocalDate.parse(input.nextLine());
        System.out.println("Time (HH:mm:ss");
        LocalTime time = LocalTime.parse(input.nextLine());
        System.out.println("Description: ");
        String description = input.nextLine();
        System.out.println("Vendor: ");
        String vendor = input.nextLine();
        System.out.println("Description: ");
        double amount = input.nextDouble();

        input.nextLine(); // consume newline character
        Transaction deposit = new Transaction(date, time, description, vendor, amount);
        ledger.add(deposit);
    }

    //Method to make payment
    private static void makePayment() {
        System.out.println("You chose to make a payment.");
        System.out.println(" Date (YYYY-MM-dd: ");
        LocalDate date = LocalDate.parse(input.nextLine());
        System.out.println("Time (HH:mm:ss");
        LocalTime time = LocalTime.parse(input.nextLine());
        System.out.println("Description: ");
        String description = input.nextLine();
        System.out.println("Vendor: ");
        String vendor = input.nextLine();
        System.out.println("Description: ");
        double amount = input.nextDouble();
        input.nextLine(); // consume newline character

        //Ensure amount is negative for a payment
        if (amount > 0) {
            amount = -amount; //convert positve amount to negative
        }

    }

    // Method to display all ledger entries
    private static void displayAllEntries() {
        // Sort ledger base on the date and time
        Collections.sort(ledger, Comparator.comparing(Transaction::getDate).reversed()
                .thenComparing(Transaction::getTime).reversed());
        //Display all ledger entries
        System.out.println("All ledger Entries: ");
        for (Transaction entry : ledger) {
            System.out.println(entry);
        }
    }


    // Method to display only deposit entries
    private static void displayDepositEntries() {
        //filter and display deposit
        System.out.println("Deposit Entries: ");
        for (Transaction entry : ledger) {
            if (entry.getAmount() >= 0) {
                System.out.println(entry);

            }
        }

    }

    // Method to display negative entries (payment)
    private static void displayNegativeEntries() {
        //filter and display only the negative
        System.out.println("Negative Entries payments: ");
        for (Transaction entry : ledger) {
            if (entry.getAmount() < 0) {
                System.out.println(entry);
            }
        }
    }

    // Method to display ledger
    private static void displayLedger() {
        if (ledger.isEmpty()) {
            System.out.println("Ledger is empty");
        } else {
            System.out.println("Ledger Entries:");
            for (Transaction transaction : ledger) {

                System.out.println("You chose to display the ledger");
                System.out.println("Date: " + transaction.getDate());
                System.out.println("Time: " + transaction.getTime());
                System.out.println("Description: " + transaction.getDescription());
                System.out.println("Vendor: " + transaction.getVendor());
                System.out.println("Amount: " + transaction.getAmount());
                System.out.println("-----------");
            }
        }

    }

        //Method to exit the application
        private static void exitApplication() {
            System.out.println("Exiting the application.");
            System.exit(0);

        }
    private static void runReport() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a report option:");
        System.out.println("1) Monthly to Date");
        System.out.println("2) Previous month");
        System.out.println("3) Year to date");
        System.out.println("4) Previous year");
        System.out.println("5) Search by Vendor Name");
        System.out.println("0) Go back to the Report Page");
        System.out.println("H) Go back to the Home Page");
        int userChoice = scanner.nextInt();
        switch (userChoice){
            case 1:
                monthlyToDateReport();
                break;
            case 2:
                previousMonthReport();
                break;
            case 3:
                YearToDateReport();
                break;
            case 4:
                previousYearReport();
                break;
            case 5:
                searchByVendorName();
                break;
            case 0:
               runReport();
                break;
            //case "H":
                //String option = input.nextLine();
            // break;
            default:
                System.out.println("Invalid option. try again.");
        }
        
    }

    private static void monthlyToDateReport() {
        System.out.println("You chose to run the monthly to date report.");
        // get the current year and month
        YearMonth currentYearMonth = YearMonth.now();
        ///Get the start data of the current month
        LocalDate startDateOfMonth = currentYearMonth.atDay(1);

        //Filter transaction from the start of the month to the current date
        ArrayList<Transaction> monthlyToDateTransaction = new ArrayList<>();
        for (Transaction transaction : ledger){
            if (!transaction.getDate().isBefore(startDateOfMonth));
            monthlyToDateTransaction.add(transaction);
        }
        // Display the transaction for the month to date
        if (monthlyToDateTransaction.isEmpty()){
            System.out.println("No transaction found for the month to date.");
        } else {
            System.out.println("Transaction for the month to date: ");
            for (Transaction transaction : monthlyToDateTransaction){
                System.out.println(transaction);
            }
        }
        runReport();
    }

    private static void previousMonthReport() {
    }

    private static void YearToDateReport() {
    }

    private static void previousYearReport() {
    }

    private static void searchByVendorName() {
    }

    //Method to read the transaction data from CSV
        public static void readTransactionFromCSV (String fileName){
       // String csvFile = "transaction.csv";
            try {
                FileReader fileReader = new FileReader("transaction.csv");
                BufferedReader reader = new BufferedReader(fileReader );
               // BufferedReader reader = new BufferedReader(new FileReader(csvFile));
                reader.readLine();
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split("\\|");
                    LocalDate date = LocalDate.parse(data[0]);
                    LocalTime time = LocalTime.parse(data[1]);
                    String description = data[2];
                    String vendor = data[3];
                    double amount = Double.parseDouble(data[4]);
                    //Transaction tran = new Transaction()
                    ledger.add(new Transaction(date, time, description, vendor, amount));
                    for (String value : data){
                        System.out.println(value + " ");
                    }
                    System.out.println();


                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

