package com.pluralsight;

public class Product {
    private String productName;
    private double totalPurchase;

    public Product(String productName, double totalPurchase) {
        this.productName = productName;
        this.totalPurchase = totalPurchase;
    }

    @Override
    public String toString() {
        return "SalesByCategory{" +
                "productName='" + productName + '\'' +
                ", totalPurchase=" + totalPurchase +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(double totalPurchase) {
        this.totalPurchase = totalPurchase;
    }
}
