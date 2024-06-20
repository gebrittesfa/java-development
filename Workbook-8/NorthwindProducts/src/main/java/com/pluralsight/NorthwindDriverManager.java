package com.pluralsight;

import com.sun.jdi.connect.spi.Connection;

public class NorthwindDriverManager {
    // uses eager loading to load the driver into memory
// if the dependency has not been added the application
// will fail here
Class.forName("com.mysql.cj.jdbc.Driver");
    // use the driver to create a connection
    Connection connection = null;
    Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost"+":3306/sakila", username, password);



}
