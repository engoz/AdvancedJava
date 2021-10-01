package com.eng;

import java.time.LocalDateTime;

public class DateMinuteCallculate {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        int hourMinute = localDateTime.getHour() * 60;
        int minute = localDateTime.getMinute();
        int sum = hourMinute + minute;
        System.out.println("Hour = " +hourMinute +" Minute " + minute  + " Sum = " + sum);
    }
}
