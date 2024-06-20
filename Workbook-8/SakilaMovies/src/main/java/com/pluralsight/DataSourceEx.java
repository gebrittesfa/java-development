package com.pluralsight;

import com.sun.jdi.connect.spi.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataSourceEx {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println(
                    "Application needs two arguments to run: " +
                            "java com.hca.jdbc.UsingDriverManager <username> " +
                            "<password>");
            System.exit(1);
        }
        // Get the username and password
        String username = args[0];
        String password = args[1];
        // Create the datasource
        BasicDataSource dataSource = new BasicDataSource();
        // Configure the datasource
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUser(username);
        dataSource.setPassword(password);
        // Interact with the database
        doSimpleQuery(dataSource);
    }

    private static void doSimpleQuery(DataSource dataSource) {
        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(
                             "SELECT first_name, last_name FROM customer " +
                                     "WHERE last_name LIKE ? ORDER BY first_name");
        ) {
            // Set any required parameters
            preparedStatement.setString(1, "Sa%");
            // Execute the query
            try (ResultSet resultSet = preparedStatement.executeQuery()
            ) {
                // Process the results
                while (resultSet.next()) {
                    System.out.printf(
                            "first_name = %s, last_name = %s;\n",
                            resultSet.getString(1), resultSet.getString(2));
                }
            }
        }
        catch (SQLException e) {
            // This will catch all SQLExceptions occurring
            // in the try block, including those in nested
            // try statements
            e.printStackTrace();
        }
    }
}