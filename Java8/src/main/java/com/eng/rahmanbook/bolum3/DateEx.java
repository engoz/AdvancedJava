package com.eng.rahmanbook.bolum3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateEx {
    public static void main(String[] args) {
        LocalDate.of(1975,2,14);
        LocalDate.of(1975, Month.FEBRUARY,14);

        //Now
        LocalDate now = LocalDate.now();

    }
}
