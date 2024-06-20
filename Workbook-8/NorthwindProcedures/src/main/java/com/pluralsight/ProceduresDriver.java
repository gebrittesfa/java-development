package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;

public class ProceduresDriver {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3307/northwind");
        dataSource.setUsername("root");
        dataSource.setPassword("password");

        ProceduresManager dao = new ProceduresManager(dataSource);
        List<Product> productList = proceduresManager.customerOrderHistory();
        //ProceduresManager.customerOrderHistory();

        List<Order>



        //   System.out.println(shipperList);
        //   dao.insertShipper();
        //   System.out.println(shipperList);
        dao.updatePhoneNumber();
        System.out.println(shipperList);
        dao.deleteShipper();
        System.out.println(shipperList);

}
