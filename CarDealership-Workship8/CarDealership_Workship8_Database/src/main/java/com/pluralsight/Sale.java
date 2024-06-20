package com.pluralsight;


import java.time.LocalDate;

public class Sale {
        private int id;
        private Vehicle vehicle;// = new Vehicle();
        private String customerName;
        private String customerAddress;
        private String customerPhone;
        private LocalDate saleDate;
        private double salePrice;

        public Sale(int id, Vehicle vehicle, String customerName, String customerAddress, String customerPhone, LocalDate saleDate, double salePrice) {
            this.id = id;
            this.vehicle = vehicle;
            this.customerName = customerName;
            this.customerAddress = customerAddress;
            this.customerPhone = customerPhone;
            this.saleDate = saleDate;
            this.salePrice = salePrice;
        }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", VIN=" + vehicle +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", saleDate=" + saleDate +
                ", salePrice=" + salePrice +
                '}';
    }
    // Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
