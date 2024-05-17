package com.pluralsight;

public class VehicleDriver {
    public static void main(String[] args) {
        /*
        I created an object using the default constructor the compiler created
         */
        Vehicles vehicles = new Vehicles();
        vehicles.setColor("Red");
        vehicles.setFuelCapacity(5);
        System.out.println(vehicles.getNumberOfPassengers());

//        Car car = new Car();
//        car.setName("Toyota Prius");//inherited methods getName and setName
//        car.setNumDoors(4);
//        //car.toString();
//        System.out.println(car.getName());
    }
}
