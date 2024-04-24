package com.pluralsight;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateEx {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today is: " + today);

    // Specify the date/time format you will want to use
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, MMM dd, YYYY HH:mm:ss");
        String fornattedDate = today.format(fmt);
        System.out.println("Today is " + fornattedDate);

        String userInput = "2002-10-17";
        LocalDate birthday = LocalDate.parse(userInput);

        fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        birthday = LocalDate.parse(userInput, fmt);
        }
    }
