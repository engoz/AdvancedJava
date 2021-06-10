package com.eng.loop;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by enginoz on 06/04/17.
 */
public class ForEachMapTest {
    public static void main(String[] args) {

        //Java old
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        System.out.println("Java Old");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item : " + entry.getKey() + "Count : " + entry.getValue());
        }

        System.out.println("Java 8");

        items.forEach((k, v) -> System.out.println("Item : " + k + "Count :" + v));

        items.forEach((k, v) -> {
            System.out.println("Item : " + k + "Count : " + v);
            if ("E".equals(k)) {
                System.out.println("Hello Engin");
            }

        });


    }
}
