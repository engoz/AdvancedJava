package com.eng.section2.java7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author ashraf
 *
 */
public class URLClassLoaderTest {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // Getting the jar URL which contains target class
        URL[] classLoaderUrls = new URL[]{new URL("file:///Users/enginoz/Works/AdvancedJava/DateUtils/target/dateutils.jar")};

        // Create a new URLClassLoader
        URLClassLoader urlClassLoader = new URLClassLoader(classLoaderUrls);

        // Load the target class
        Class<?> appClass = urlClassLoader.loadClass("com.eng.App");

        // Create a new instance from the loaded class
        Constructor<?> constructor = appClass.getConstructor();
        Object dateObj = constructor.newInstance();

        // Getting a method from the loaded class and invoke it
        Method method = appClass.getMethod("sayHello");
        method.invoke(dateObj);

    }

}
