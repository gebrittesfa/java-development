package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalesDao {
private BasicDataSource dataSource;
    public SalesDao(BasicDataSource dataSource) {
        this.dataSource=dataSource;
    }

        private static final String INSERT_SALE_SQL = "INSERT INTO sales (vin, customerName, " +
                "customerAddress, customerPhone, saleDate, salePrice) VALUES (?, ?, ?, ?, ?, ?)";
        private static final String SELECT_ALL_SALES = "SELECT * FROM sales";

        private Connection getConnection() throws SQLException {
            return dataSource.getConnection();
            // Logic to obtain a database connection
        }

        public void addSale(Sale sale) {
            try (Connection connection = getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SALE_SQL)) {
                preparedStatement.setInt(1, sale.getNIN());
                preparedStatement.setString(2, sale.getCustomerName());
                preparedStatement.setString(3, sale.getCustomerAddress());
                preparedStatement.setString(4, sale.getCustomerPhone());
                preparedStatement.setDate(5, Date.valueOf(sale.getSaleDate()));
                preparedStatement.setDouble(6, sale.getSalePrice());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public List<Sale> getAllSales() {
            List<Sale> sales = new ArrayList<>();
            try (Connection connection = getConnection();
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(SELECT_ALL_SALES)) {
                while (resultSet.next()) {
                    Sale sale = new Sale(resultSet.getInt("id"), resultSet., resultSet.getString("customerName"),
                            resultSet.getString("customerAddress"), resultSet.getString("customerPhone"),
                            resultSet.getDate("saleDate").toLocalDate(), resultSet.getDouble("salePrice"));
                    sales.add(sale);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return sales;
        }

    }
