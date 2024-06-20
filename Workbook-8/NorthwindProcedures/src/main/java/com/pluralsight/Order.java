package com.pluralsight;

public class Order {
    private String shippedDate;
    private double subtotal;
    private int orderId;

    public Order(String shippedDate, double subtotal, int orderId) {
        this.shippedDate = shippedDate;
        this.subtotal = subtotal;
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "shippedDate='" + shippedDate + '\'' +
                ", subtotal=" + subtotal +
                ", orderId=" + orderId +
                '}';
    }

    public String getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(String shippedDate) {
        this.shippedDate = shippedDate;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
