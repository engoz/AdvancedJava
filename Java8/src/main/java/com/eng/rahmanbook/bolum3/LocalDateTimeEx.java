package com.eng.rahmanbook.bolum3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime dateTime =
                LocalDateTime.of(2014, Month.JANUARY, 3, 4, 5, 45);

        int year = dateTime.getYear();// 2014
        Month month = dateTime.getMonth();// JANUARY
        int dayOfMonth = dateTime.getDayOfMonth();// 3
        int hour = dateTime.getHour();// 4
        int minute = dateTime.getMinute();// 5
        int second = dateTime.getSecond();// 45”

        System.out.println(year+"-"+ month+"-"+dayOfMonth+" "+hour+":"+minute+":"+second);

        // LocalDateTime2LocalDate ve LocalDateTime2LocalTime
        LocalDate date = dateTime.toLocalDate();
        LocalTime time = dateTime.toLocalTime();

        LocalDateTime minus = dateTime
                .minusDays(3)
                .plusYears(3)
                .plusMinutes(3)
                .minusWeeks(5)
                .plusSeconds(2)
                .plus(3, ChronoUnit.DECADES)
                .minus(3, ChronoUnit.DECADES);

        System.out.println(minus);
    }
}
