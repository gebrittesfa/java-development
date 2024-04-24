package com.pluralsight;

public class Customer {
    private int id;
    private String name;
    private float amountOwed;

    public Customer(int id) {
        this.id = id;
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(float amountOwed) {
        this.amountOwed = amountOwed;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amountOwed=" + amountOwed +
                '}';
    }

    public float getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(float amountOwed) {
        this.amountOwed = amountOwed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
