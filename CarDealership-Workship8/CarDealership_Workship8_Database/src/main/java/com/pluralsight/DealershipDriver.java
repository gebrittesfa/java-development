package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;

public class DealershipDriver {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        //Configure the datasource
        dataSource.setUrl("jdbc:mysql://localhost:3306/cardealershipdatabase");
        dataSource.setUsername("root");
        dataSource.setPassword("YU_gebrit!25");

        SalesDao salesDao = new SalesDao(dataSource);

        List<Vehicle> vehicleList= salesDao.addSale(q);
           System.out.println(vehicleList);
           salesDao.getAllSales();
        //   System.out.println(shipperList);
        salesDao.updatePhone();
        System.out.println(vehicleList);
        salesDao.de();
        System.out.println(shipperList);


        SakilaDataManager dataManager = new SakilaDataManager(dataSource);
        List<Actor> actorList = dataManager.actorLastName();
        System.out.println(actorList);
        actorList.forEach(System.out::println);

        List<Film> movies = dataManager.actorMovies();
        movies.forEach(System.out::println);
    }
}
