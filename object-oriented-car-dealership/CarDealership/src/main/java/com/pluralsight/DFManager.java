//package com.pluralsight;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class DFManager {
//    ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
//    ArrayList<Dealership> inventory1 = new ArrayList<Dealership>();
//    private String filePath; //th path to the data file
//
//    public DFManager(String filePath) {
//        this.filePath = filePath;
//    }
//
//    public Dealership getDealership() {
//        Dealership dealership = null;
//
//        try {
//            FileReader fileReader = new FileReader("inventory.csv");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            bufferedReader.readLine();
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] vehicleData = line.split("\\|");
//                    int vin = Integer.parseInt(vehicleData[0]);
//                    int year = Integer.parseInt(vehicleData[1]);
//                    String make = vehicleData[2];
//                    String model = vehicleData[3];
//                    String vehicleType = vehicleData[4];
//                    String color = vehicleData[5];
//                    int odometer = Integer.parseInt(vehicleData[6]);
//                    double price = Double.parseDouble(vehicleData[7]);
//                    dealership.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
//                }
//            } catch(IOException e){
//                //System.out.println("Error found " + e.getMessage());
//                e.printStackTrace();
//            }
//            return dealership;
//        }
//        public void saveDealership (Dealership dealership){
//            //code to save dealership to file go here
//        }
//}
//
