package com.eng.rahmanbook.bolum3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocatTimeEx {

    public static void main(String[] args) {
        LocalTime now= LocalTime.now();

        LocalTime time= LocalTime.of(18, 20, 55); // 18:20:55

        int hour = time.getHour();// 18
        int minute = time.getMinute();// 20
        int second = time.getSecond();// 55

        System.out.println(hour+":"+minute+":"+second);


        LocalTime noon = LocalTime.NOON;// 12:00
        LocalTime midnight = LocalTime.MIDNIGHT;// 00:00

        System.out.println(noon);
        System.out.println(midnight);

        LocalTime parse = LocalTime.parse("10:05");// 10:05
        System.out.println(parse);

        LocalTime minus = time
                .plusSeconds(45)
                .minusSeconds(5)
                .minus(5, ChronoUnit.SECONDS);// 18:20:35”

        System.out.println(minus);
    }
}
