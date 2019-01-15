package com.example.util.test6;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

/**
 * Должно быть - 2018-11-22T14:06:40±02:00
 * //            2018-11-22T14:28:42.367Z
 *
 * @see https://stackoverflow.com/questions/3469507/how-can-i-change-the-date-format-in-java
 * @see https://www.mkyong.com/java8/java-8-convert-date-to-localdate-and-localdatetime
 * @see https://www.foreach.be/blog/java-8-date-and-time
 * @see https://howtodoinjava.com/java/date-time/java-date-examples
 *
 * @see http://qaru.site/questions/18016/change-date-format-in-a-java-string
 */

public class MySimpleDateFormat {

//    public static void main(String[] args) {
//
//        ZoneId defaultZoneId = ZoneId.systemDefault();
//        System.out.println("System Default TimeZone : " + defaultZoneId); //todo System Default TimeZone : Europe/Kiev
//
//        //toString() append +8 automatically.
//        Date date = new Date();
//        System.out.println("date : " + date); //todo date : Thu Nov 22 16:22:09 EET 2018
//
//        //1. Convert Date -> Instant
//        Instant instant = date.toInstant();
//        System.out.println("instant : " + instant); //todo instant : 2018-11-22T14:22:09.213Z
//
//        //2. Instant + system default time zone + toLocalDate() = LocalDate
//        LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();
//        System.out.println("localDate : " + localDate); //todo localDate : 2018-11-22
//
//        //3. Instant + system default time zone + toLocalDateTime() = LocalDateTime
//        LocalDateTime localDateTime = instant.atZone(defaultZoneId).toLocalDateTime();
//        System.out.println("localDateTime : " + localDateTime); //todo localDateTime : 2018-11-22T16:22:09.213
//
//        //4. Instant + system default time zone = ZonedDateTime
//        ZonedDateTime zonedDateTime = instant.atZone(defaultZoneId);
//        System.out.println("zonedDateTime : " + zonedDateTime); //todo zonedDateTime : 2018-11-22T16:22:09.213+02:00[Europe/Kiev]
//
//
//        System.out.println("###############################");
//
//        System.out.println(instant.atZone(defaultZoneId));
//        System.out.println(instant.atZone(defaultZoneId).toLocalDateTime());
//        System.out.println(instant.atZone(ZoneId.of("Europe/Paris")));
//        System.out.println(instant.atZone(ZoneOffset.ofHours(2))); //todo 2018-11-22T16:50:14.399+02:00
//        System.out.println(instant.atZone(ZoneOffset.ofHours(2))); //todo 2018-11-22T16:51:38.927+02:00 =========== 2018-11-22T14:06:40±02:00
//
//
//        System.out.println("###############################");
//
//        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
//                .appendOptional( DateTimeFormatter.ISO_LOCAL_DATE )
//                .optionalStart().appendLiteral( "T" ).optionalEnd()
//                .appendOptional( DateTimeFormatter.ISO_LOCAL_TIME )
//                .toFormatter();
//
//        LocalDate date1 = LocalDate.parse( "2018-03-16T06:30", formatter );
//        LocalDate date2 = LocalDate.parse( "2018-03-16", formatter );
//        LocalTime time3 = LocalTime.parse( "2018-03-16T06:30", formatter );
//        LocalTime time4 = LocalTime.parse( "06:30", formatter );
//        LocalDateTime localDateTime5 = LocalDateTime.parse( "2018-03-16T06:30", formatter );
////        LocalDateTime localDateTime6 = LocalDateTime.parse( new Date().toString(), formatter );
//
//        System.out.println( date1.toString() );
//        System.out.println( date2.toString() );
//        System.out.println( time3.toString() );
//        System.out.println( time4.toString() );
//        System.out.println( localDateTime5.toString() );
////        System.out.println( localDateTime6.toString() );
//    }

    /*
        2018-11-22T14:06:40±02:00
     */
    public static void main(String args[]) {
        Date date = new Date();
//        String DATE_FORMAT = "yyyy-MM-dd:HH:mm.SSSZ"; //todo  2018-11-22:16:11.794+0200
//        String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS Z"; //todo  2018-11-22 17:13:39.355 +0200
//        String DATE_FORMAT = "yyyy-MM-dd HH:mm Z"; //todo  2018-11-22 17:14 +0200
//        String DATE_FORMAT = "yyyy-MM-dd HH:mm z"; //todo  2018-11-22 17:17 EET
//        String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ"; //todo  2018-11-22T17:20:03+0200
        String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssXXX"; //todo  2018-11-22T17:21:07+02:00
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

        System.out.println("Today is " + sdf.format(date));
    }

}
