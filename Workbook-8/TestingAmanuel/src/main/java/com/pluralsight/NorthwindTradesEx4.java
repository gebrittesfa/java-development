//package org.example;
//
//import java.sql.*;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class NorthwindTradesEx4 {
//    public static void main(String[] args) {
//        //while (true) { // Display the home screen
//        Scanner input = new Scanner(System.in);
//        int option;
//        System.out.println("What do you want to do? \n\t 1) Display all products"+
//                "\n\t 2) Display all customers \n\t 0) Exit \n Select an option:");
//        option = input.nextInt();
//        if (option==1) {
//            displayAllProducts(connection);
//        } else if (option == 2) {
//            displayAllCustomers(connection);
//        } else if (option == 0) {
//            System.exit(0);
//        }
//    }
//
//    // Create the datasource
//    BasicDataSource dataSource = new BasicDataSource ();
//    // Configure the datasource
// dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
// dataSource.setUser(username);
// dataSource.setPassword(password);
//    // Interact with the database
//    doSimpleQuery(dataSource);
//    Connection connection;
//    Connection = DriverManager.getConnection("\"jdbc:mysql://localhost\"+" +
//            ":3306/northwind", "root", "password");
//    private static void displayAllCustomers (Collections connection) throws SQLException {
//        String query = "SELECT ContactName, CompanyName, City, Country, Phone FROM Customers ORDER BY Country";
//        PreparedStatement statement = null; //connection.prepareStatement(query);
//        ResultSet resultSet = null;
//        try {
//            ResultSet resultSet = statement.executeQuery();//query
//            System.out.println("ContactName\n\tCompanyName\n\tCity\n\tCountry\n\tPhone");
//            System.out.println("--------\t------------\t----------\t----------\t-----------");
//            while (resultSet.next()) {
//                String contactName = resultSet.getString("ContactName");
//                String companyName = resultSet.getString("CompanyName");
//                String city = resultSet.getString("City");
//                String country = resultSet.getString("Country");
//                String phone = resultSet.getString("Phone");
//                System.out.printf("%s | %s | %s | %s | %s%n", contactName, companyName, city, country, phone);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//    private static void displayAllProducts(Collections connection) throws SQLException{
//        String query = "SELECT * FROM products";
//        PreparedStatement statement = connection.prepareStatement(query);
//        ResultSet resultSet = statement.executeQuery();
//        try {
//            ResultSet resultSet = statement.executeQuery(query);
//            System.out.println("Contact Name | Company Name | City | Country | Phone");
//            System.out.println("------------------------------------------------------");
//            while (resultSet.next()) {
//                String contactName = resultSet.getString("ContactName");
//                String companyName = resultSet.getString("CompanyName");
//                String city = resultSet.getString("City");
//                String country = resultSet.getString("Country");
//                String phone = resultSet.getString("Phone");
//                System.out.printf("%s | %s | %s | %s | %s%n", contactName, companyName, city, country, phone);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
