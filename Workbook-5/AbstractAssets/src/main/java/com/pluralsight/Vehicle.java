package com.pluralsight;

import java.time.LocalDate;

public class Vehicle {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String makeModel, int year, int odometer) {
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;

    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    public double getValue() {
        double value = 0;
        double percentRed =0;
        int currentYear = LocalDate.now().getYear();
        int yearOld = currentYear - year;
        if (yearOld>10){
            value=1000;
        } else {
            System.out.println("Under 10 years old");
            if (yearOld>=0 && yearOld<=3){
            percentRed = 0.03;
        } else if (yearOld>=4 && yearOld<6) {
            percentRed = 0.06;
        } else if (yearOld>=7 && yearOld<=10) {
                percentRed = 0.08;
            }
            value = getOriginalCost() - (getOriginalCost()*percentRed);
            System.out.println(value);

            }
       if(odometer>100000 && !(makeModel.contains("Toyota"))||
        makeModel.contains("Honda")){
           value = getOriginalCost() -(getOriginalCpst()*0.25);
       }
       return value;
    }
}
