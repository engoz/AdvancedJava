package com.eng.functional;

import java.time.LocalDate;
import java.util.function.Function;

public class TestFunc {

    public static void main(String[] args) {
        Function<LocalDate, String> addDate = (date) -> "The Day of the week is" + date.getDayOfWeek();
        System.out.println(addDate);
    }
}
