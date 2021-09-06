package com.eng.section2.java7;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ExceptionHandlingForReflectiveMethods {

    private final static Logger LOGGER = Logger.getLogger(ExceptionHandlingForReflectiveMethods.class.getName());

    public static void main(String[] args) {
     //   beforeJava7();
        withJava7();
    }

    /**
     * Sample implementation before Java 7
     *
     */
    private static void beforeJava7(){
        try {
            Class.forName("com.eng.section2.java7.CatchingMultipleExceptions").getMethod("withJava7").invoke(null,new Object[]{});
        }  catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException
                | ClassNotFoundException nex) {
            LOGGER.log(Level.SEVERE, nex.toString());
        }
    }

    /**
     * Sample implementation from Java 7
     *
     */
    public static void withJava7() {
        try {
            Class.forName("com.eazybytes.java7.CatchingMultipleExceptions").getMethod("withJava7").invoke(null,
                    new Object[] {});
        } catch (ReflectiveOperationException nex) {
            LOGGER.log(Level.SEVERE, nex.toString());
        }
    }

}
