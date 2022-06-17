package com.eng;


import org.joda.time.LocalDate;
import org.slf4j.Logger;


import java.util.logging.LogManager;

public class App {
    private static final Logger logger = (Logger) LogManager.getLogManager().getLogger(App.class.getName());
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
