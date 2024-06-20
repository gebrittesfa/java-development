package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProceduresManager {
    private BasicDataSource dataSource;
    Scanner scanner = new Scanner(System.in);

    public ProceduresManager(BasicDataSource dataSource) {
        this.dataSource=dataSource;
    }
    public List<Product> customerOrderHistory(){
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM shippers;";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);){
            try (ResultSet resultSet = preparedStatement.executeQuery()){
                while (resultSet.next()){
                    String name = resultSet.getString("CompanyName");
                    String phone = resultSet.getString("phone");
                    Product product = new Product(name,phone);
                    products.add(product);
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        return products;
    }

}
