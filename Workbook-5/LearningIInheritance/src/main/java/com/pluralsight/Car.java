package com.pluralsight;

public class Car {
    /*
    private int vin, year, odometer;
    private String make, model, vehicleType, color;
    private double price; */

    private String name;
    private String enginType;
    private String transmissionType;
    private int numDoors; //vin;
    private int numOfSeats; // year;
    private int maximumSpeed;
    private int currentSpeed;
    private int fuelLevel;

    // Constructor with parameters for each private variable
    public Car(String name, String enginType, String transmissionType, int numDoors, int numOfSeats,
               int maximumSpeed, int currentSpeed, int fuelLevel) {
        this.name = name;
        this.enginType = enginType;
        this.transmissionType = transmissionType;
        this.numDoors = numDoors;
        this.numOfSeats = numOfSeats;
        this.maximumSpeed = maximumSpeed;
        this.currentSpeed = currentSpeed;
        this.fuelLevel = fuelLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnginType() {
        return enginType;
    }

    public void setEnginType(String enginType) {
        this.enginType = enginType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
