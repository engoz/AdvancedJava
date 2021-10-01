package com.eng;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class DateUtilTest {

    private final static TimeZone UK_TIME_ZONE = TimeZone.getTimeZone("Europe/London");
    private final static TimeZone TR_TIME_ZONE = TimeZone.getTimeZone("Europe/Istanbul");
    private final static TimeZone GMT_TIME_ZONE = TimeZone.getTimeZone("GMT");
    public static final Byte ACTIVE = 0;
    public static final Byte PASSIVE = 1;

    public static void main(String[] args) {

        List<TimerTest> timerTests = new ArrayList<>();
        TimerTest test = new TimerTest();
        test.setDate(new Date());
        test.setStartTime(760);
        test.setEndTime(815);
        test.setTimerDayType(TimerDayType.S);
        test.setIsActive(ACTIVE);
        timerTests.add(test);
        boolean b = validTime(timerTests);
        System.out.println(b);
    }

    private static boolean validTime(List<TimerTest> brokerRunTimers) {


        if (brokerRunTimers.isEmpty()){
            return false;
        }

        for (TimerTest brokerRunTimer : brokerRunTimers){
            Byte isActive = brokerRunTimer.getIsActive();
            if (!isActive.equals(ACTIVE)) continue;

            LocalDateTime localDateTime = LocalDateTime.now();
            int hour = localDateTime.getHour();
            int minute = localDateTime.getMinute();
            TimerDayType timerDayType = brokerRunTimer.getTimerDayType();
            int startTime = brokerRunTimer.getStartTime();
            int startTimeHour = startTime /60;
            int startTimeMinute = startTime % 60;
            int endTime = brokerRunTimer.getEndTime();
            int endTimeHour = endTime /60;
            int endTimeMinute = endTime % 60;

            if (timerDayType.equals(TimerDayType.W)){
                return  isWeekendCheck(getIstanbulTimeZone(),startTimeHour,startTimeMinute,hour,minute,endTimeHour,endTimeMinute);
            }else if (timerDayType.equals(TimerDayType.S)){
                //if (DateUtil.isWeekend(DateUtil.getIstanbulTimeZone())) continue;
                java.sql.Date date = null;
                try {
                    date = new java.sql.Date(brokerRunTimer.getDate().getTime());
                }catch (Exception e){
                    System.out.println("Error " + e);
                }
                if (date == null){
                    return false;
                }
                LocalDate specialDate = date.toLocalDate();
                int specialDayOfYear = specialDate.getDayOfYear();
                int localTimeDateOfYear = localDateTime.getDayOfYear();
                if (specialDayOfYear == localTimeDateOfYear) {
                    return validStartAndEndTime(startTimeHour,startTimeMinute,hour,minute,endTimeHour,endTimeMinute);
                }
            }else if (timerDayType.equals(TimerDayType.A)){
                    return validStartAndEndTime(startTimeHour,startTimeMinute,hour,minute,endTimeHour,endTimeMinute);
            }else {
                return false;
            }

        }
        return false;
    }

    public static boolean validStartAndEndTime(int startTimeHour, int startTimeMinute, int nowHour, int nowMinute,int endTimeHour, int endTimeMinute){
        boolean valid = false;

        if (startTimeHour == nowHour){
            if(startTimeMinute <= nowMinute) {
                valid = true;
            }
        }

        if (!valid && startTimeHour < nowHour) {
            valid = true;
        }

        if (valid && nowHour == endTimeHour){
            if(nowMinute>endTimeMinute)  valid = false;
        }

        if (valid && nowHour > endTimeHour ){
            valid = false;
        }


        System.out.println("Start " + startTimeHour+" : " +startTimeMinute);
        System.out.println("Now " + nowHour+" : " +nowMinute);
        System.out.println("End " + endTimeHour+" : " +endTimeMinute);
        return valid;
    }

    public static TimeZone getIstanbulTimeZone(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.setTimeZone(TimeZone.getTimeZone("Europe/Istanbul"));
        return cal.getTimeZone();
    }

    public static boolean isWeekendCheck(TimeZone timeZone,int startTimeHour, int startTimeMinute, int nowHour, int nowMinute,int endTimeHour, int endTimeMinute) {
        Calendar now = Calendar.getInstance(timeZone);
        int day = now.get(Calendar.DAY_OF_WEEK);

        if (day == Calendar.SATURDAY) {
            boolean valid = false;
            if (startTimeHour == nowHour){
                if(startTimeMinute <= nowMinute) {
                    valid = true;
                }
            }

            if (!valid && startTimeHour < nowHour) {
                valid = true;
            }
            return valid;
        }

        if (day == Calendar.SUNDAY) {
            boolean valid = true;
            if (nowHour == endTimeHour){
                if(nowMinute>endTimeMinute)  valid = false;
            }

            if (nowHour > endTimeHour ){
                valid = false;
            }
            return valid;
        }

        return false;

    }

    private static class TimerTest{
        private Date date;
        private Byte isActive;
        private TimerDayType timerDayType;
        private int startTime;
        private int endTime;

        public TimerTest(){}

        public TimerTest(Date date, Byte isActive, TimerDayType timerDayType, int startTime, int endTime) {
            this.date = date;
            this.isActive = isActive;
            this.timerDayType = timerDayType;
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Byte getIsActive() {
            return isActive;
        }

        public void setIsActive(Byte active) {
            isActive = active;
        }

        public TimerDayType getTimerDayType() {
            return timerDayType;
        }

        public void setTimerDayType(TimerDayType timerDayType) {
            this.timerDayType = timerDayType;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }
    }

    public enum TimerDayType implements Serializable {

        W("Weekend"),
        S("Special"),
        A("AllDay");

        private String description;

        private TimerDayType(String description) {
            setDescription(description);
        }

        public String getDescription() {
            return description;
        }

        private void setDescription(String description) {
            this.description = description;
        }

    }

}
