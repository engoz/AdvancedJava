package com.eng.section2.java7;

import com.eng.section2.java7.util.CustomDirtyResource;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SupressedExceptions {

    private final static Logger LOGGER = Logger.getLogger(SupressedExceptions.class.getName());

    public static void main(String[] args) {

        try {
            beforeJava7();
        } catch (Exception ex) {
            LOGGER.info("Before Java 7");
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }


        try {
            withjava7();
        } catch (Exception ex) {
            LOGGER.info("Java 7");
            LOGGER.log(Level.SEVERE, ex.getMessage());
            Throwable[] suppressedExceptions = ex.getSuppressed();
            int numSupperessed = suppressedExceptions.length;
            if (numSupperessed > 0){
                for (final Throwable exception:suppressedExceptions){
                    LOGGER.log(Level.SEVERE,  exception.getMessage());
                }
            }
        }
    }

    public static void beforeJava7() throws Exception {
        CustomDirtyResource cr = null;
        try {
            cr = new CustomDirtyResource();
            cr.readFromResource();
        }finally {
            cr.close();
        }
    }

    public static void withjava7() throws Exception {
        try (CustomDirtyResource cr = new CustomDirtyResource()) {
                cr.readFromResource();
        }
    }
}
