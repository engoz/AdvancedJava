package com.eng.bufffer;

import java.util.Date;

public class PerformanceCompare {
    public static void main(String[] args) {
        long startTimeOfString = new Date().getTime();
        String string = "Dwight";
        for (int i = 0; i < 10000; i++) {
            string = string + "Schrute";
        }
        System.out.println("Time taken by String: " + (new Date().getTime() - startTimeOfString) + "ms");

        long startTimeOfStringBuffer = new Date().getTime();
        StringBuffer stringBuffer = new StringBuffer("Dwight");
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("Schrute");
        }
        System.out.println("Time taken by StringBuffer: " + (new Date().getTime() - startTimeOfStringBuffer) + "ms");

        long startTimeOfStringBuilder = new Date().getTime();
        StringBuilder stringBuilder = new StringBuilder("Dwight");
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("Schrute");
        }
        System.out.println("Time taken by StringBuilder: " + (new Date().getTime() - startTimeOfStringBuilder) + "ms");
    }
}
