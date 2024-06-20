package com.pluralsight;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class LeaseDao {

        private static final String INSERT_LEASE_SQL = "INSERT INTO leases (vin, leaseStartDate, " +
                "leaseEndDate, monthlyPayment) VALUES (?, ?, ?, ?)";
        private static final String SELECT_ALL_LEASES = "SELECT * FROM leases";

        private Connection getConnection() {
            // Logic to obtain a database connection
        }

        public void addLease(Lease lease) {
            try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_LEASE_SQL)) {
                preparedStatement.setInt(1, lease.getVIN());
                preparedStatement.setDate(2, Date.valueOf(lease.getLeaseStartDate()));
                preparedStatement.setDate(3, Date.valueOf(lease.getLeaseEndDate()));
                preparedStatement.setDouble(4, lease.getMonthlyPayment());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public List<Lease> getAllLeases() {
            List<Lease> leases = new ArrayList<>();
            try (Connection connection = getConnection();
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(SELECT_ALL_LEASES)) {
                while (resultSet.next()) {
                    Lease lease = new Lease(resultSet.getInt("id"), resultSet.getInt("VIN"),
                            resultSet.getDate("leaseStartDate").toLocalDate(),
                            resultSet.getDate("leaseEndDate").toLocalDate(),
                            resultSet.getDouble("monthlyPayment"));
                    leases.add(lease);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return leases;
        }

    }
