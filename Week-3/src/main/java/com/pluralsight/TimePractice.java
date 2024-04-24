package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimePractice {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time " + currentTime);
        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("Right now is " + rightNow);

        System.out.println("Day of the week: "+today.getDayOfWeek());
        System.out.println("Day of the month: "+ today.getDayOfMonth());
        System.out.println("Day of year: "+ today.getDayOfYear());
        System.out.println("Month name: "+ today.getMonth());
        System.out.println("Month number: "+ today.getMonthValue());

    }
}
