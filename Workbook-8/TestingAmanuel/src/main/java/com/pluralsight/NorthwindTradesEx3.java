//package com.pluralsight;
//
//import java.beans.Statement;
//import java.sql.*;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class NorthwindTradesEx3 {
//    public static void main(String[] args) {
//        //while (true) { // Display the home screen
//        Scanner input = new Scanner(System.in);
//        Connection connection = null;
//        Statement statement = null;
//        int option;
//            System.out.println("What do you want to do? \n\t 1) Display all products"+
//                    "\n\t 2) Display all customers \n\t 0) Exit \n Select an option:");
//            option = input.nextInt();
//            if (option==1) {
//                displayAllProducts(connection);
//            } else if (option == 2) {
//                displayAllCustomers(connection);
//            } else if (option == 0) {
//                System.exit(0);
//            }
//        }
//        try {
//        Class.forName("\"com.mysql.cj.jdbc. Driver\"");
//        Connection = DriverManager.getConnection("\"jdbc:mysql://localhost\"+" +
//                ":3306/northwind", "root", "password");
//    } catch (Exception e){
//            e.printStackTrace();
//    } finally {}
////        private static void displayAllCustomers (Collections connection) throws SQLException{
////            String query = "SELECT ContactName, CompanyName, City, Country, Phone FROM Customers ORDER BY Country";
////            PreparedStatement statement = null; //connection.prepareStatement(query);
////            ResultSet resultSet = null;
////            try {
////                ResultSet resultSet = statement.executeQuery();//query
////                System.out.println("ContactName\n\tCompanyName\n\tCity\n\tCountry\n\tPhone");
////                System.out.println("--------\t------------\t----------\t----------\t-----------");
////                while (resultSet.next()) {
////                    String contactName = resultSet.getString("ContactName");
////                    String companyName = resultSet.getString("CompanyName");
////                    String city = resultSet.getString("City");
////                    String country = resultSet.getString("Country");
////                    String phone = resultSet.getString("Phone");
//private static void displayAllCustomers (Connection connection){
//    String query = "SELECT contactname, companyname, city, country, phone," +
//"ORDER BY country";
//    PreparedStatement statement = null;
//    ResultSet resultSet = null;
//try {
//    statement = connection. prepareStatement (query);
//    resultSet = statement.executeQuery(query);
//while (resultSet.next()){
//        System.out.println(resultSet.getString(1)+"\t"+
//        resultSet. getString(2)+"\t"+
//        resultSet.getString(3)+"\t"+
//        resultSet.getString(4)+"\t"+
//        resultSet.getString(5));
//
//        System.out.printf("%s | %s | %s | %s | %s%n", contactName, companyName, city, country, phone);
//                }
//            } catch (Exception e)  {
//                e.printStackTrace();
//            }
//        }
//        private static void displayAllProducts(Collections connection) throws SQLException{
//            String query = "SELECT * FROM products";
//            PreparedStatement statement = connection.prepareStatement(query);
//            ResultSet resultSet = statement.executeQuery();
//            try {
//                ResultSet resultSet = statement.executeQuery(query);
//                System.out.println("Contact Name | Company Name | City | Country | Phone");
//                System.out.println("------------------------------------------------------");
//                while (resultSet.next()) {
//                    String contactName = resultSet.getString("ContactName");
//                    String companyName = resultSet.getString("CompanyName");
//                    String city = resultSet.getString("City");
//                    String country = resultSet.getString("Country");
//                    String phone = resultSet.getString("Phone");
//                    System.out.printf("%s | %s | %s | %s | %s%n", contactName, companyName, city, country, phone);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//    }
//}
