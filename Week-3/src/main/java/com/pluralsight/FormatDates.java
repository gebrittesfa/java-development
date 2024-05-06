package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter ;
        dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String formatteDate1 = dateTimeFormatter.format(currentDate);
        //2021-09-05
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatteDate1 = dateTimeFormatter.format(currentDate);
        System.out.println(formatteDate1);
        //September 5, 2021
        dateTimeFormatter =dateTimeFormatter.ofPattern("MMMM dd, yyyy");
        formatteDate1 = dateTimeFormatter.format(currentDate);
        System.out.println(formatteDate1);
        // Sunday, sep 5, 10:02
        //ZonedDateTime zonedDateTime = currentDate.now(ZoneId.of("GMT"));
        //LocalDateTime currentDate1 = LocalTime.now(ZoneId.of("GMT"));
        dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy HM:mm");
        //formatteDate1 =dateTimeFormatter.format(currentDate.atZone(ZoneId.of("GMT")));
        System.out.println(formatteDate1);
        //Local time Zone
        dateTimeFormatter = DateTimeFormatter.ofPattern(("h:mm 'on' dd-MM-yyyy"));
        //formatteDate1 = dateTimeFormatter.format(currentDate.atZone(ZoneId.of("America/New_York")));
        System.out.println(formatteDate1);


    }
}
