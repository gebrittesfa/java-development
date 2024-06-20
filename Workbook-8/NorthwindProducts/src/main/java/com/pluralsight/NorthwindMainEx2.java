package com.pluralsight;

import java.sql.*;
import java.util.Collections;

public class NorthwindMainEx2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//load the MySQL Driver:
            Class.forName("com.mysql.cj.jdbc. Driver");
            //Open a connection to the database:
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://Localhost:\"\n" +
                    "            \"3307/sakila", "root", "password");
        try{
            // Establishing the connection to the database
            Collections collections = DriverManager.getConnection();
            String query = "SELECT ProductId, ProductName, UnitPrice, UnitsInStock FROM Products"; //WHERE Last_name = ?" ;

            // Create a sta object to execute the query
            PreparedStatement statement = connection.prepareStatement (query) ;
            //Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery();
            // Option 1: Display stacked information
            System.out.println("Option 1: Stacked Information");
            while (resultSet.next()) {
                int productId = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                double unitPrice = resultSet.getDouble("UnitPrice");
                int unitsInStock = resultSet.getInt("UnitsInStock");
                System.out.println("Product Id: " + productId);
                System.out.println("Name: " + productName);
                System.out.println("Price: " + unitPrice);
                System.out.println("Stock: " + unitsInStock);
                System.out.println();
            }
            // Resetting the cursor for the result set to reuse it
            resultSet.beforeFirst();
            // Option 2: Display rows of information
            System.out.println("Option 2: Rows of Information");
            System.out.printf("%-5s %-20s %-10s %-5s%n", "Id", "Name", "Price", "Stock");
            while (resultSet.next()) {
                int productId = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                double unitPrice = resultSet.getDouble("UnitPrice");
                int unitsInStock = resultSet.getInt("UnitsInStock");
                System.out.printf("%-5d %-20s %-10.2f %-5d%n", productId, productName, unitPrice, unitsInStock);
            }
            // Closing the resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        }
}