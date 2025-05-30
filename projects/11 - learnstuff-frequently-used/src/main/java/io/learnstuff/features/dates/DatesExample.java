package io.learnstuff.features.dates;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DatesExample {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Tomorrow: " + tomorrow);

        System.out.println("Local date: " + converDateToLocalDate(new Date()));
        System.out.println("Util date: " + converLocalDateToDate(today));

        LocalDate localDate = LocalDate.parse("2020-11-23");
        System.out.println("Parsed date: " + localDate);
    }

    public static LocalDate converDateToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static Date converLocalDateToDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

}
