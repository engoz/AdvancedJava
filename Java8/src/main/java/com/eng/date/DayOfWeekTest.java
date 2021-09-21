package com.eng.date;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekTest {
    public static boolean checkWeekend(LocalDate ld) {
        DayOfWeek d = ld.getDayOfWeek();
        return d == DayOfWeek.SATURDAY || d == DayOfWeek.SUNDAY;
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(checkWeekend(LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth())));
        System.out.println(checkWeekend(LocalDate.of(2021, 9, 26))); // false, terça-feira
    }
}
