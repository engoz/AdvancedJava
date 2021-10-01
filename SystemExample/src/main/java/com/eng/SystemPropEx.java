package com.eng;

public class SystemPropEx {

    public static void main(String[] args) {

        /*
        java -jar jarName -DpropertyName=value
        Setting the property of foo with a value of bar in app.jar:
        java -jar app -Dfoo="bar"
        * */

        String log_dir = System.getProperty("log_dir","/tmp/log");
        System.setProperty("log_dir", "/tmp/log");
        System.out.println(log_dir);
    }
}
