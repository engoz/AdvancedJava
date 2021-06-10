package com.eng.date;

import java.time.*;
import java.util.Date;
import java.util.Locale;

/**
 * Created by enginoz on 18/10/17.
 */
public class LocalDateTimeApp {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime time = localDateTime.withHour(23).withMinute(00).withSecond(00).withNano(000);
        System.out.println(time);
    }

    private void minus() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime minus = localDateTime.minusHours(23);
        System.out.println(minus);
    }

    private void add() {
        Instant instant = Instant.ofEpochMilli(new Date().getTime());
        ZoneId.of(Locale.getDefault().getCountry());
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);

        System.out.println(ZoneOffset.UTC);
        ldt.plusHours(23);
    }

    private void dateConvert() {
        //LocalDateTime << Instant<< Date
        Instant instant = Instant.ofEpochMilli(new Date().getTime());
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
        //Date << Instant << LocalDateTime
        Instant instant2 = ldt.toInstant(ZoneOffset.UTC);
        Date date = Date.from(instant2);

    }
}
