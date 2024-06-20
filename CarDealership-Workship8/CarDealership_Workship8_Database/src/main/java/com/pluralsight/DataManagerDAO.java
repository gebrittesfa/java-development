package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataManagerDAO {
    private BasicDataSource dataSource;

    public DataManagerDAO(  BasicDataSource dataSource){
        this.dataSource=dataSource;
    }
    private final String sql = "jdbc:mysql://localhost:3306/cardealershipdatabase";
    private final String userName = "root";
    private final String password = "YU_gebrit!25";

    private static final String INSERT_VEHICLE_SQL = "INSERT INTO vehicles" +
            "  (vin, year, make, model, vehicleType, color, odometer, price) VALUES " +
            " (?, ?, ?, ?, ?, ?, ?, ?);";

    private static final String SELECT_VEHICLE_BY_VIN = "select vin, year, make, model, vehicleType, color, odometer, price from vehicles where vin =?";
    private static final String SELECT_ALL_VEHICLES = "select * from vehicles";
    private static final String DELETE_VEHICLES_SQL = "delete from vehicles where vin = ?;";
    private static final String UPDATE_VEHICLES_SQL = "update vehicles set year = ?, make= ?, model =?, vehicleType =?, color =?, odometer =?, price =? where vin = ?;";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(sql, userName, password   );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


        public void insertVehicle(Vehicle vehicle) throws SQLException {
            try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_VEHICLE_SQL)) {
                preparedStatement.setInt(1, vehicle.getVin());
                preparedStatement.setInt(2, vehicle.getYear());
                preparedStatement.setString(3, vehicle.getMake());
                preparedStatement.setString(4, vehicle.getModel());
                preparedStatement.setString(5, vehicle.getVehicleType());
                preparedStatement.setString(6, vehicle.getColor());
                preparedStatement.setInt(7, vehicle.getOdometer());
                preparedStatement.setDouble(8, vehicle.getPrice());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                printSQLException(e);
            }
        }

        public Vehicle selectVehicle(int vin) {
            Vehicle vehicle = null;
            try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_VEHICLE_BY_VIN);) {
                preparedStatement.setInt(1, vin);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int year = resultSet.getInt("year");
                    String make = resultSet.getString("make");
                    String model = resultSet.getString("model");
                    String vehicleType = resultSet.getString("vehicleType");
                    String color = resultSet.getString("color");
                    int odometer = resultSet.getInt("odometer");
                    double price = resultSet.getDouble("price");
                    vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                }
            } catch (SQLException e) {
                printSQLException(e);
            }
            return vehicle;
        }

        public List<Vehicle> selectAllVehicles() {
            List<Vehicle> vehicles = new ArrayList<>();
            try (Connection connection = getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_VEHICLES);) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int vin = resultSet.getInt("vin");
                    int year = resultSet.getInt("year");
                    String make = resultSet.getString("make");
                    String model = resultSet.getString("model");
                    String vehicleType = resultSet.getString("vehicleType");
                    String color = resultSet.getString("color");
                    int odometer = resultSet.getInt("odometer");
                    double price = resultSet.getDouble("price");
                    vehicles.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
                }
            } catch (SQLException e) {
                printSQLException(e);
            }
            return vehicles;
        }

        public boolean deleteVehicle(int vin) throws SQLException {
            boolean rowDeleted;
            try (Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(DELETE_VEHICLES_SQL);) {
                statement.setInt(1, vin);
                rowDeleted = statement.executeUpdate() > 0;
            }
            return rowDeleted;
        }

        public boolean updateVehicle(Vehicle vehicle) throws SQLException {
            boolean rowUpdated;
            try (Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(UPDATE_VEHICLES_SQL);) {
                statement.setInt(1, vehicle.getYear());
                statement.setString(2, vehicle.getMake());
                statement.setString(3, vehicle.getModel());
                statement.setString(4, vehicle.getVehicleType());
                statement.setString(5, vehicle.getColor());
                statement.setInt(6, vehicle.getOdometer());
                statement.setDouble(7, vehicle.getPrice());
                statement.setInt(8, vehicle.getVin());
                rowUpdated = statement.executeUpdate() > 0;
            }
            return rowUpdated;
        }
    public static void createTable(BasicDataSource dataSource) {
        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement( "CREATE TABLE film_reviews " +
                             "(" + "movie_review_id bigint primary key, " +
                             "news_source varchar(500) not null, " +
                             "stars int not null, " + "reviewer varchar(200), " +
                             "film_id smallint unsigned not null, " +
                             "FOREIGN KEY (film_id) REFERENCES " +
                             "film(film_id)) ENGINE=INNODB;"); ) {
            // execute the prepared statement
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        private void printSQLException(SQLException ex) {
            for (Throwable e : ex) {
                if (e instanceof SQLException) {
                    e.printStackTrace(System.err);
                    System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                    System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                    System.err.println("Message: " + e.getMessage());
                    Throwable t = ex.getCause();
                    while (t != null) {
                        System.out.println("Cause: " + t);
                        t = t.getCause();
                    }
                }
            }
        }

}
