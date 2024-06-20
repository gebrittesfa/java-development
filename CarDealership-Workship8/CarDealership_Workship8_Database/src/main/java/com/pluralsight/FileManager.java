//package com.pluralsight;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FileManager {
//
//        private final String jdbcURL = "jdbc:mysql://localhost:3306/your_database";
//        private final String jdbcUsername = "your_username";
//        private final String jdbcPassword = "your_password";
//
//        private static final String INSERT_VEHICLE_SQL = "INSERT INTO vehicles" +
//                "  (vin, year, make, model, vehicleType, color, odometer, price) VALUES " +
//                " (?, ?, ?, ?, ?, ?, ?, ?);";
//
//        private static final String SELECT_VEHICLE_BY_VIN = "select vin, year, make, model, vehicleType, color, odometer, price from vehicles where vin =?";
//        private static final String SELECT_ALL_VEHICLES = "select * from vehicles";
//        private static final String DELETE_VEHICLES_SQL = "delete from vehicles where vin = ?;";
//        private static final String UPDATE_VEHICLES_SQL = "update vehicles set year = ?, make= ?, model =?, vehicleType =?, color =?, odometer =?, price =? where vin = ?;";
//
//        protected Connection getConnection() {
//            Connection connection = null;
//            try {
//                connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            return connection;
//        }
//
//        public void insertVehicle(Vehicle vehicle) throws SQLException {
//            try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_VEHICLE_SQL)) {
//                preparedStatement.setInt(1, vehicle.getVin());
//                preparedStatement.setInt(2, vehicle.getYear());
//                preparedStatement.setString(3, vehicle.getMake());
//                preparedStatement.setString(4, vehicle.getModel());
//                preparedStatement.setString(5, vehicle.getVehicleType());
//                preparedStatement.setString(6, vehicle.getColor());
//                preparedStatement.setInt(7, vehicle.getOdometer());
//                preparedStatement.setDouble(8, vehicle.getPrice());
//                preparedStatement.executeUpdate();
//            } catch (SQLException e) {
//                printSQLException(e);
//            }
//        }
//
//        public Vehicle selectVehicle(int vin) {
//            Vehicle vehicle = null;
//            try (Connection connection = getConnection();
//                 PreparedStatement preparedStatement = connection.prepareStatement(SELECT_VEHICLE_BY_VIN);) {
//                preparedStatement.setInt(1, vin);
//                ResultSet rs = preparedStatement.executeQuery();
//                while (rs.next()) {
//                    int year = rs.getInt("year");
//                    String make = rs.getString("make");
//                    String model = rs.getString("model");
//                    String vehicleType = rs.getString("vehicleType");
//                    String color = rs.getString("color");
//                    int odometer = rs.getInt("odometer");
//                    double price = rs.getDouble("price");
//                    vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
//                }
//            } catch (SQLException e) {
//                printSQLException(e);
//            }
//            return vehicle;
//        }
//
//        public List<Vehicle> selectAllVehicles() {
//            List<Vehicle> vehicles = new ArrayList<>();
//            try (Connection connection = getConnection();
//                 PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_VEHICLES);) {
//                ResultSet rs = preparedStatement.executeQuery();
//                while (rs.next()) {
//                    int vin = rs.getInt("vin");
//                    int year = rs.getInt("year");
//                    String make = rs.getString("make");
//                    String model = rs.getString("model");
//                    String vehicleType = rs.getString("vehicleType");
//                    String color = rs.getString("color");
//                    int odometer = rs.getInt("odometer");
//                    double price = rs.getDouble("price");
//                    vehicles.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
//                }
//            } catch (SQLException e) {
//                printSQLException(e);
//            }
//            return vehicles;
//        }
//
//        public boolean deleteVehicle(int vin) throws SQLException {
//            boolean rowDeleted;
//            try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_VEHICLES_SQL);) {
//                statement.setInt(1, vin);
//                rowDeleted = statement.executeUpdate() > 0;
//            }
//            return rowDeleted;
//        }
//
//        public boolean updateVehicle(Vehicle vehicle) throws SQLException {
//            boolean rowUpdated;
//            try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_VEHICLES_SQL);) {
//                statement.setInt(1, vehicle.getYear());
//                statement.setString(2, vehicle.getMake());
//                statement.setString(3, vehicle.getModel());
//                statement.setString(4, vehicle.getVehicleType());
//                statement.setString(5, vehicle.getColor());
//                statement.setInt(6, vehicle.getOdometer());
//                statement.setDouble(7, vehicle.getPrice());
//                statement.setInt(8, vehicle.getVin());
//                rowUpdated = statement.executeUpdate() > 0;
//            }
//            return rowUpdated;
//        }
//
//        private void printSQLException(SQLException ex) {
//            for (Throwable e : ex) {
//                if (e instanceof SQLException) {
//                    e.printStackTrace(System.err);
//                    System.err.println("SQLState: " + ((SQLException) e).getSQLState());
//                    System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
//                    System.err.println("Message: " + e.getMessage());
//                    Throwable t = ex.getCause();
//                    while (t != null) {
//                        System.out.println("Cause: " + t);
//                        t = t.getCause();
//                    }
//                }
//            }
//        }
//    }
