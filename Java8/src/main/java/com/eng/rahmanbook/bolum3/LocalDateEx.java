package com.eng.rahmanbook.bolum3;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDate.of(1975,2,14);
        LocalDate.of(1975, Month.FEBRUARY,14);

        //Now
        LocalDate now = LocalDate.now(); //2022-04-25
        System.out.println(now);

        LocalDate now2 = now.withYear(2021);
        System.out.println(now);
        System.out.println(now2);

        LocalDate now3 = now.withMonth(8).withDayOfMonth(17);

        System.out.println(now);
        System.out.println(now3);

        LocalDate now4 = now
                .with(ChronoField.YEAR, 2012)
                .with(ChronoField.MONTH_OF_YEAR, 8)
                .with(ChronoField.DAY_OF_MONTH,3); // 2012-08-03”

        System.out.println(now);
        System.out.println(now4);

        LocalDate now5 = now
                .plusWeeks(2)
                .plusDays(3)
                .plusYears(3)
                .plusDays(7); //

        System.out.println(now5);

        LocalDate now6 =  now
                .plus(2, ChronoUnit.WEEKS)
                .plus(3, ChronoUnit.YEARS)
                .plus(3, ChronoUnit.DECADES); //”

        System.out.println(now6);

        LocalDate now7 = now.minusDays(5).minusMonths(2);

        System.out.println(now7);

        LocalDate now8 = now
                .minus(2, ChronoUnit.WEEKS)
                .minus(3, ChronoUnit.YEARS)
                .minus(33, ChronoUnit.DAYS);

        System.out.println(now8);


    }
}
