package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;

public class Employee /*extends Person*/ {
    private String employeeId;
    private LocalDate hireDate;
    private double salary;
    private String department;

//    public Employee(String employeeId, String firstName, String lastName,
//                    LocalDate birthDate, LocalDate hireDate, String department) {
//        //use super keyword to call the constructor in the parent class
//        super(firstName,lastName,birthDate);
//        this.employeeId = employeeId;
//        this.hireDate = hireDate;
//        this.department=department;
//    }

    public int getMonthsEmployed(){
        int currentMonth = LocalDate.now().getMonthValue();
        int hireMonth = hireDate.getMonthValue();
        return currentMonth-hireMonth;
    }

    public double earnPayRaise(double percent){
        return salary += salary*percent;
    }
}

