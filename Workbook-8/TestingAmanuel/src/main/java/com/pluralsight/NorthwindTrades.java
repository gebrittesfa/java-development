package com.pluralsight;

import java.sql.*;

public class NorthwindTrades {
    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {
        Class.forName("\"com.mysql.cj.jdbc. Driver\"");
        Connection connection;
        Connection = DriverManager.getConnection("\"jdbc:mysql://localhost\"+" +
                ":3306/northwind", "root","password");
        String query = "SELECT productid, productname, unitprice, unitstock FROM products"
        PreparedStatement statement = connection.prepareStatement(query);
        //statenent. setString (1, "Sa%");
        ResultSet resultSet = statement.executeQuery();
        System.out.println("Id\tName\t\tPrice\tStock");
        System.out.println("------\t--------\t-------\t-----");
        While (resultSet.next()) {
            System.out.println(resultSet.getInt("productid")+"\t"+
            resultSet.getString("productname"+"\t"+
            resultSet.getDouble("unitprice"+"\t"+
            resultSet.getInt("unitsinstock"));
        }
            resultSet.close();
            statement.close();
            connection.close();
        }
    }
