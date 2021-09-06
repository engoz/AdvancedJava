package com.eng.section2.java7;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoaderEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        withJava7();
    }

    private static  void beforeJava7() throws MalformedURLException, ClassNotFoundException {
        URL[] urls = {new URL("file:junit-4.11.jar"),new URL("file:commons-io-2.8.0.jar")};
        URLClassLoader loader = new URLClassLoader(urls);
        Class<?> junitClass = loader.loadClass("org.junit.runner.JUnitCore");
    }

    private static void withJava7() throws IOException, ClassNotFoundException {
        URL[] urls = {new URL("file:junit-4.11.jar"),new URL("file:commons-io-2.8.0.jar")};
        try(URLClassLoader loader = new URLClassLoader(urls)){
            Class<?> junitClass = loader.loadClass("org.junit.runner.JUnitCore");
            System.out.println(junitClass.getName());
        }

    }
}
