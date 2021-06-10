package com.eng.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Created by servicium on 30.10.2015.
 */
public class LocaleDateApp {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2016, 05, 14);
        LocalDate date2 = date1.plusYears(1);
        LocalDate date3 = LocalDate.of(1999, Month.DECEMBER, 10);

        System.out.println("Date 2 = " + date3);

        LocalDate otherDate = LocalDate.now();
        LocalDate now = LocalDate.now();
        LocalDate nowWithMonth = now.withMonth(3);

        System.out.println("Date 2 = " + nowWithMonth);


        System.out.println("Date 1 = " + date1);
        System.out.println("Date 2 = " + date2);
        System.out.println("Now = " + now);

        now.withYear(2016); // 2016-04-05
        now.withMonth(8).withDayOfMonth(17); // 2014-08-17
        now.with(ChronoField.YEAR, 2012)
                .with(ChronoField.MONTH_OF_YEAR, 8)
                .with(ChronoField.DAY_OF_MONTH, 3); // 2012-08-03

        System.out.println("NowWith Mounth = " + nowWithMonth);

        LocalDate otherDate1 = otherDate.plusYears(2)
                .plusDays(3)
                .plusMonths(7)
                .plusWeeks(4);

        LocalDate otherDate2 = otherDate.plus(2, ChronoUnit.WEEKS).plus(3, ChronoUnit.WEEKS).plus(3, ChronoUnit.DECADES);

        LocalDate otherDate3 = otherDate.minus(2, ChronoUnit.YEARS).minus(33, ChronoUnit.DAYS);

        System.out.println("other date 1 " + otherDate1);
        System.out.println("other date 2 " + otherDate2);
        System.out.println("other date 3 " + otherDate3);


    }
}
