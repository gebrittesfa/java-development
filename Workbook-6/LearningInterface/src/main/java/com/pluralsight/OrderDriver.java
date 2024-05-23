package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class OrderDriver {
    public static void main(String[] args) {
        List<Order> allOrders = new ArrayList<>();
        List<Order> impulseOrders = new ArrayList<>();
        LineItem item1 = new LineItem(1,"Fish", 20,5);
        LineItem item2 = new LineItem(2,"shoes", 88,7);
        LineItem item3 = new LineItem(3,"Banana", 5,8);


        Order order = new Order(1, "Delina");
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

// loop through all orders
// and add them to the list of impulse buys
        for (Order order : allOrders) {
            if (order.getTotal() < 25) {
                impulseOrders.add(order);
            }
        }
        double salesTotal=0;
        for (Order order1 : allOrders){
            salesTotal+=order.getTotal();
        }
    }
}
