package itmo.java.basics.lesson13;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateExample {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);

//
//        Date date2 = new Date(0);
//        System.out.println(date2);

//        double years = (date.getTime() - date2.getTime()) / 1000.0 / 60/ 60/ 24/ 365;
//        System.out.println(new DecimalFormat("#.##").format(years));


//        Calendar calendar = new GregorianCalendar();
//        System.out.println(calendar);

//        System.out.println(Arrays.toString(Month.values()));
//
//        System.out.println(Month.JANUARY.ordinal());
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//        dateFormat.setTimeZone(TimeZone.getDefault());
//
//        Date timeZoneDate = null;
//
//        try {
//            timeZoneDate = dateFormat.parse("2010-05-23T09:01:02");
//        } catch (ParseException e) {
//            System.err.println(e.getMessage());
//        }
//
//        System.out.println(timeZoneDate);

//        ZonedDateTime zonedDateTime = date.toInstant().atZone(ZoneId.of("America/Phoenix"));
//        System.out.println(zonedDateTime);

//
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        System.out.println(dateFormat.format(date));

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

//        System.out.println(localDateTime);

        LocalDateTime dateTime = LocalDateTime.of(2014, 5, 3, 12, 15, 30);
//        System.out.println(dateTime);

//        System.out.println(LocalDateTime.of(2025, Month.FEBRUARY, 28, 12, 15, 20));


        LocalDate someDate = localDate.plusMonths(50);

//        System.out.println(localDate);

        Period period = Period.between(localDate, someDate);
//        System.out.println(period.getYears());

        Instant now = Instant.now();
//        System.out.println(now);

//        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss yyyy/MM/dd")));


        YearMonth yearMonth = YearMonth.now();
//        System.out.println(yearMonth);

//        Date date = new Date();
//        LocalDateTime dateToLocalDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
//        System.out.println(date);
//        System.out.println(dateToLocalDateTime);

        Date date = convertToDateViaSqlDate(someDate);
        System.out.println(date);

        Date date2 = convertToDateViaSqlDate(dateTime);
        System.out.println(date2);

    }

    public static Date convertToDateViaSqlDate(LocalDate localDate) {
        return java.sql.Date.valueOf(localDate);
    }

    public static Date convertToDateViaSqlDate(LocalDateTime localDateTime) {
        return java.sql.Timestamp.valueOf(localDateTime);
    }
}
