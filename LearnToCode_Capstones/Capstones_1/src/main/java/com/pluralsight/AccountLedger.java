package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AccountLedger {
    //Initialize scanner object to read input from the console
    static Scanner input = new Scanner(System.in);
    // Create an ArrayList to store transaction
    static ArrayList<Transaction> transaction = new ArrayList<>();
    static ArrayList<Transaction> previousMonthTransaction = new ArrayList<>();
    // main method execution
    public static void main(String[] args) {
        String fileName = "transaction.csv";
        // Read file method call
        readCSVFile (fileName);
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
                addDeposit(transaction);
                break;
            case "P":
                makePayment(transaction);
                break;
            case "L":
                displayLedger(transaction);
                break;
            case "R":
                runReport();
                break;
            case "X":
                exitApplication(transaction);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    // Method to add a deposit
    private static void addDeposit(ArrayList<Transaction> transaction) {
        System.out.print(" Date (YYYY-MM-dd): ");
        //Prompt the user for the deposit information and save it to the CSV file
        String date = input.nextLine();
        System.out.println("Enter time (HH:mm:ss):");
        String time = input.nextLine();
        System.out.println("Description: ");
        String description = input.nextLine();
        System.out.println("Vendor: ");
        String vendor = input.nextLine();
        System.out.println("Amount: ");
        double amount = input.nextDouble();
        input.nextLine(); // consume newline

        // Save deposit information to CSV file
        try{
        FileWriter writer = new FileWriter("transaction.csv", true);
        writer.write(date + "|" + time + "|" + description + "|" + vendor + "|" + amount + "\n");
        System.out.println("Deposit added successfully.");
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
        System.err.println("Error writing to file: " + e.getMessage());
    } finally {
            input.close();

        }
    }
        //Method to make payment (debit)
        private static void makePayment(ArrayList<Transaction> transaction) {
            // Similar to addDeposit, prompt the user for payment detalis and handle writing to file
//            System.out.println("You chose to make a payment.");
//            System.out.println(" Date (YYYY-MM-dd): ");
//            String date = input.nextLine();
//            System.out.println("Time (HH:mm:ss");
//            String time = input.nextLine();
            LocalDate dt= LocalDate.now(); // Get the current date
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYYY-MM-dd");//Define the date formatter pattern
            String date = dt.format(formatter); // Format the date using the formatter
            System.out.println("Formatted Date: " + date); //Print the formatted date
            System.out.println("Time (HH:mm:ss");
            String time = input.nextLine();
            System.out.println("Description: ");
            String description = input.nextLine();
            System.out.println("Vendor: ");
            String vendor = input.nextLine();
            System.out.println("Amount: ");
            double amount = input.nextDouble();
            input.nextLine(); // consume newline character
            //transaction.add(transaction);
            //Ensure amount is negative for a payment
            if (amount > 0) {
                amount = -amount; //convert positve amount to negative
            }
            // Save payment information to CSV file
            try  (FileWriter writer = new FileWriter("transaction.csv", true)){
                writer.write(date + "|" + time + "|" + description + "|" + vendor + "|" + amount + "\n");
                System.out.println("Payment added successfully.");
                //writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Error writing to file: " + e.getMessage());
            }finally {
                input.close();
            }
        }
    // Method to display all ledger entries
    private static void displayAllEntries(ArrayList<Transaction> transactions) {
        // Sort ledger base on the date and time
        Collections.sort(transaction, Comparator.comparing(Transaction::getDate).reversed()
                .thenComparing(Transaction::getTime).reversed());
        //Display all ledger entries
        System.out.println("All ledger Entries: ");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
    // Method to display negative entries (payment)
    private static void displayNegativeEntries(ArrayList<Transaction> transaction) {
        //filter and display only the negative
        System.out.println("Negative Entries payments: ");
//        for (Transaction transaction : transactions) {
//            if (transaction.getAmount() < 0) {
//                System.out.println(transaction);
//
//            }
    }

            // Method to display the ledger
            private static void displayLedger (ArrayList < Transaction > transaction) {
                //Read and display the ledger
                String fileName = "transaction.csv";
                readCSVFile(fileName);
            }

            // Method to exit the application
        private static void exitApplication (ArrayList<Transaction> transaction) {
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
            switch (userChoice) {
                case 1:
                    monthlyToDateReport(true );
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
                case 'H':
                    String option = input.nextLine();
                    break;
                default:
                    System.out.println("Invalid option. try again.");
            }
        }

        // Create monthlyToDate method
        private static void monthlyToDateReport( boolean displayReport) {
            if (!displayReport) {
                System.out.println("You chose to run the monthly to date report.");
            }
            // get the current year and month
            YearMonth currentYearMonth = YearMonth.now();
            ///Get the start data of the current month
            LocalDate startDateOfMonth = currentYearMonth.atDay(1);

            //Filter transaction from the start of the month to the current date
            ArrayList<Transaction> monthlyToDateTransaction = new ArrayList<>();
            for (Transaction transaction : transaction) {
                if (transaction.getDate().equalsIgnoreCase("s") || transaction.getDate().isBlank()) {
                    monthlyToDateTransaction.add(transaction);

                }
            }
            // Display the transaction for the month to date
            if (monthlyToDateTransaction.isEmpty()) {
                System.out.println("No transaction found for the month to date.");
            } else {
                System.out.println("Transaction for the month to date: ");
                for (Transaction transaction : monthlyToDateTransaction) {
                    System.out.println(transaction);
                }
            }
            if (!displayReport) {
                runReport();
            }
        }
        private static void previousMonthReport() {
            System.out.println("You chose to run by previous month report");
            // get the current year and month
            YearMonth currentYearMonth = YearMonth.now();
            YearMonth previousYearMonth = currentYearMonth.minusMonths(1);

//            ArrayList<Transaction> previousMonthTransaction = new ArrayList<>();
//        for (Transaction transaction : transaction) {
//            if (transaction.getDate().getYear() == previousYearMonth.getYear() &&
//                    transaction.getDate().getMonth() == previousYearMonth.getMonthValue()) ;
//            previousMonthTransaction.add(transaction);
//        }

            // Display the transaction for the month to date
            if (previousMonthTransaction.isEmpty()) {
                System.out.println("No transaction found for the month to date.");
            } else {
                System.out.println("Transaction for the month to date: ");
                for (Transaction transaction : previousMonthTransaction) {
                    System.out.println(transaction);
                }
            }
            //call the method to run the report again or return to the menu
            runReport();
        }

        private static void YearToDateReport() {
            System.out.println("You chose to run the year to date report.");
            // Get the current year
            int currentYear = Year.now().getValue();

            // Get the start date of the current year
            LocalDate startDateOfYear = LocalDate.of(currentYear, 10, 1);

            // Filter transactions from the start of the year to the current date
            ArrayList<Transaction> yearToDateReportTransaction = new ArrayList<>();
        for (Transaction transaction : transaction){
            if (!transaction.getDate().isEmpty()){
                yearToDateReportTransaction.add(transaction);
            }
        }
            // Display the current the transaction
            if (yearToDateReportTransaction.isEmpty()) {
                System.out.println("No transaction found for the year to date.");
            } else {
                System.out.println("Transaction for the year to date: ");
                for (Transaction transaction : yearToDateReportTransaction) {
                    System.out.println(transaction);
                }
            }
            runReport();
        }
        private static void previousYearReport() {
            System.out.println("You chose to run the previous year report.");
            int currentYear = Year.now().getValue();
            boolean founderTransactions = false;

//            for (Transaction transaction : transaction){
//                if (transaction.getDate();
//            }
        }
        private static void searchByVendorName() {

        }

            //Method to read the CSV file
        public static void readCSVFile(String fileName ){
            ArrayList<Transaction> transaction = new ArrayList<Transaction>();
            String readCSVFile = "transaction.csv";
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader reader = new BufferedReader(fileReader);
                String line;
                reader.readLine();
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split("\\|");// Split line and create Transaction
                    for (String value : data){
                        System.out.print(value + " | ");
                    }
                    System.out.println(); // move to the next line
//                    String date = LocalDate.parse(data[0]).toString();
//                    System.out.println(date);
//                    LocalTime time = LocalTime.parse(data[1]);
//                    String description = data[2];
//                    String vendor = data[3];
//                    double amount = Double.parseDouble(data[4]);
//                    Transaction transaction1 = new Transaction(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]));
//                    transaction.add(transaction1); // Then add the transaction to the csv
//                    System.out.println(transaction1.getDate() + "Time " +transaction1.getTime() +"Description " + transaction1.getDescription()
//                    +"Vendor"+ transaction1.getVendor() +"Amount" + transaction1.getAmount());

                    //fileReader.close();
                    //reader.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
//           for (Transaction transaction1 : transaction) {
//               System.out.println(transaction);
//           }
        }
    }


