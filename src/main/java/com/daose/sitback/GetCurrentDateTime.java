package com.daose.sitback;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

//https://www.mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/
public class GetCurrentDateTime {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static String getOne() {
        Date date = new Date();

        return sdf.format(date);
    }

    /*
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(sdf.format(date));

        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));

    }
    */
}