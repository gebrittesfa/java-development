package com.pluralsight;

import java.sql.*;

public class UsingDriverManager {
//    public static void main(String[] args) throws SQLException,
//            ClassNotFoundException {
//        if (args.length != 2) {
//            System.out.println(
//                    "Application needs two arguments to run: " +
//                            "java com.pluralsight.UsingDriverManager <username> <password>");
//            System.exit(1);
//        }
//        // get the user name and password from the command line args
//        String username = args[0];
//        String password = args[1];
//        // load the driver
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        // create the connection and prepared statement
//        Connection connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/sakila", username, password);
//        PreparedStatement preparedStatement =
//                connection.prepareStatement(
//                        "SELECT first_name, last_name FROM customer " +
//                                "WHERE last_name LIKE ? ORDER BY first_name");
//        // set the parameters for the prepared statement
//        preparedStatement.setString(1, "Sa%");
//        // execute the query
//        ResultSet resultSet = preparedStatement.executeQuery();
//        // loop thru the results
//        while (resultSet.next()) {
//            // process the data
//            System.out.printf("first_name = %s, last_name = %s;\n",
//                    resultSet.getString(1), resultSet.getString(2));
//        }
//        // close the resources
//        resultSet.close();
//        preparedStatement.close();
//        connection.close();
//    }
//
//}
//public static void main(String[] args) throws SQLException,
//        ClassNotFoundException {
//    if (args.length != 2) {
//        System.out.println(
//                "Application needs two arguments to run: " +
//                        "java com.hca.jdbc.UsingDriverManager <username> " +
//                        "<password>");
//        System.exit(1);
//    }
//    // get the user name and password from the command line args
//    String username = args[0];
//    String password = args[1];
//    // load the driver
//    Class.forName("com.mysql.cj.jdbc.Driver");
//// Establish the variables with null outside the try scope
//    Connection connection = null;
//    PreparedStatement preparedStatement = null;
//    ResultSet resultSet = null;
//    try {
//        // create the connection and prepared statement
//        connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/sakila",
//                username, password);
//        preparedStatement = connection.prepareStatement(
//                "SELECT first_name, last_name FROM customer " +
//                        "WHERE last_name LIKE ? ORDER BY first_name");
//        // set the parameters for the prepared statement
//        preparedStatement.setString(1, "Sa%");
//        // execute the query
//        resultSet = preparedStatement.executeQuery();
//        // loop thru the results
//        while (resultSet.next()) {
//            // process the data
//            System.out.printf("first_name = %s, last_name = %s;\n",
//                    resultSet.getString(1), resultSet.getString(2));
//        }
//    }
//    catch (SQLException e) {
//        e.printStackTrace();
//    }
//    finally {
//        // close the resources
//        if (resultSet != null) resultSet.close();
//        if (preparedStatement != null) preparedStatement.close();
//        if (connection != null) connection.close();
//    }
//}
public static void main(String[] args) throws ClassNotFoundException {
    if (args.length != 2) {
        System.out.println("Application needs two arguments to run: " +
                "java com.pluralsight.UsingDriverManager <username> <password>");
        System.exit(1);
    }

    // get the user name and password from the command line args
    String username = args[0];
    String password = args[1];
    // load the driver
    Class.forName("com.mysql.cj.jdbc.Driver");

        /*
        Create the connection and prepared statement in a try-with-resources block
         */
    try (Connection connection = DriverManager.getConnection
            ("jdbc:mysql://localhost:3307/sakila", username, password);
         PreparedStatement preparedStatement = connection.prepareStatement(
                 "SELECT first_name, last_name FROM customer " + "WHERE " +
                         "last_name LIKE ? ORDER BY first_name");
    ) {
        // set the parameters for the prepared statement
        preparedStatement.setString(1, "Sa%");

            /*
            execute the query - also declare the ResultSet within a try-with-resources block
             */
        try (ResultSet resultSet = preparedStatement.executeQuery()) {

            // loop thru the results
            while (resultSet.next()) {
                // process the data
                System.out.printf("first_name = %s, last_name = %s;\n",
                        resultSet.getString(1), resultSet.
                                getString(2));
            }
        }
    } catch (SQLException e) {
            /*
            This will catch all SQLEXceptions occurring in the block including those in
            nested try statements
             */
        e.printStackTrace();
    }
}
}
