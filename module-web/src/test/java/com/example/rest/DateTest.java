package com.example.rest;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
//        Date date = new Date(2018,1,15);
//        LocalDate now = LocalDate.now();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//
//        System.out.println("now = " + now.toString());
//
//        LocalDate digitizeDate = convert(date);
//        System.out.println("date = " + dateFormat.format( date ));
//
//        int diffDays = Period.between(digitizeDate, now).getDays();
//        System.out.print(">>>> diffDays = " + diffDays);


//        LocalDate digitizeDate = LocalDate.of(2018, 1, 15);
        LocalDate digitizeDate = LocalDate.of(2018, 9, 15);
//        LocalDate now = LocalDate.of(2018, 9, 18);
        LocalDate now = LocalDate.now();

        System.out.println("diffDays = " + digitizeDate.until(now, ChronoUnit.DAYS));
    }

    public static LocalDate convert(Date date) {
        return Instant.ofEpochMilli(date.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}
