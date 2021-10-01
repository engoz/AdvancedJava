package com.eng;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PriceDisableDates {

    private final static TimeZone GMT_TIME_ZONE = TimeZone.getTimeZone("GMT");
    private final static TimeZone TR_TIME_ZONE = TimeZone.getTimeZone("Europe/Istanbul");

    public static void main(String[] args) throws ParseException {
        List<Date> disableDates = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        format.setTimeZone(TR_TIME_ZONE);

        String string = "2021-10-30 00:00:00 TRT";
        Date date = format.parse(string);
        System.out.println(date); // Sat Jan 02 00:00:00 GMT 2010

        disableDates.add(date);

        String string2 = "2022-01-01 00:00:00 TRT";
        Date someDate  = format.parse(string2);
        System.out.println(someDate);
        disableDates.add(someDate);

        String string3 = "2021-10-01 00:00:00 TRT";
        Date someDate1 = format.parse(string3);
        System.out.println(someDate1);
        disableDates.add(someDate1);

        boolean disabledDay = disabledDate(disableDates);
        if (isValidTime() && !disabledDay){
            System.out.println("fiyat akışı var");
        }else {
            System.out.println("Fiyat akışı yok");
        }
    }

    public static boolean disabledDate(List<Date> disableDates) {
        boolean disable = false;
        if (!disableDates.isEmpty()){
            for (Date disableDate : disableDates) {
                disable = checkDisabledDay(disableDate);
                if (disable) {
                    System.out.println("Disable Date =  " + disableDate);
                    return disable;
                }
            }
        }
        return disable;
    }

    private static boolean checkDisabledDay(Date checkDay){
        Calendar checkCal = Calendar.getInstance();
        checkCal.setTime(checkDay);
        checkCal.setTimeZone(TR_TIME_ZONE);

        //CheckDay
        int checkDayOfYear = checkCal.get(Calendar.DAY_OF_YEAR);
        int checkYear = checkCal.get(Calendar.YEAR);

        //Now
        Calendar now = Calendar.getInstance();
        now.setTimeZone(TR_TIME_ZONE);
        int nowDayOfYear = now.get(Calendar.DAY_OF_YEAR);
        int nowYear = now.get(Calendar.YEAR);



        if(nowYear == checkYear) {
            if (nowDayOfYear == checkDayOfYear) {
                return true;
            }
        }
        return false;
    }


    private static boolean checkDisabledDay2(Date checkDay){
        Calendar checkCal = new GregorianCalendar();
        checkCal.setTime(checkDay);
        checkCal.setTimeZone(GMT_TIME_ZONE);

        //CheckDay
        int checkDayOfYear = checkCal.get(Calendar.DAY_OF_YEAR);
        int checkMonth = checkCal.get(Calendar.MONTH);
        int checkYear = checkCal.get(Calendar.YEAR);

        //Now
        Calendar now = Calendar.getInstance(GMT_TIME_ZONE);
        int nowDayOfYear = now.get(Calendar.DAY_OF_YEAR);
        int nowMonth = now.get(Calendar.MONTH);
        int nowYear = now.get(Calendar.YEAR);
        int hour = now.get(Calendar.HOUR_OF_DAY);

        if (checkDayOfYear == 1 && checkMonth==0 &&  nowMonth==checkMonth&& checkYear-1==nowYear){
            if (hour < 21){
                return true;
            }
        }

        if(nowYear == checkYear && nowMonth==checkMonth&& nowDayOfYear==checkDayOfYear-1) {
            if (hour >= 21) {
                return true;
            }
        }

        if(nowYear == checkYear && nowMonth==checkMonth&& nowDayOfYear==checkDayOfYear){
            if (hour < 21){
                return true;
            }
        }
        return false;
    }


    public static boolean isValidTime() {
        Calendar now = Calendar.getInstance(GMT_TIME_ZONE);
        int day = now.get(Calendar.DAY_OF_WEEK);
        if (day == Calendar.SATURDAY) {
            return false;
        }
        int hour = now.get(Calendar.HOUR_OF_DAY);
        if (day == Calendar.FRIDAY) {
            if (hour >= 21) {
                return false;
            }
        } else if (day == Calendar.SUNDAY) {
            if (hour < 22) {
                return false;
            }
        }
        return true;
    }
}
