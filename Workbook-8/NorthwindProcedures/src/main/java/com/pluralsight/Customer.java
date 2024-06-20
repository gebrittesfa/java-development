package com.pluralsight;

public class Customer {
    private String shippedDate;
    private double subtotal;

    public Customer(String shippedDate, double subtotal) {
        this.shippedDate = shippedDate;
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "SalesByYear{" +
                "shippedDate='" + shippedDate + '\'' +
                ", subtotal=" + subtotal +
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
}
