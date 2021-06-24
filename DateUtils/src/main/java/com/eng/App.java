package com.eng;

import org.apache.log4j.Logger;
import org.joda.time.LocalDate;

public class App {
    private static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println(getLocalCurrentDate());
    }

    public static String getLocalCurrentDate() {

        if (logger.isDebugEnabled()) {
            logger.debug("getLocalCurrentDate() is executed!");
        }

        LocalDate date = new LocalDate();
        return date.toString();

    }

    public void sayHello() {

        System.out.println("Merhaba");

    }
}