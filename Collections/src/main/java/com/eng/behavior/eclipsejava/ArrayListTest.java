package com.eng.behavior.eclipsejava;

import java.util.ArrayList;

/**
 * Created by servicium on 17.06.2015.
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<String>(20);
        isimler.add("Engin");
        isimler.add("Ozlem");
        isimler.add("Can");
        isimler.add(0, "Zeki");
        isimler.add(1, "Remziye");
        System.out.println("Eleman Sayisi :" + isimler.size());

        for (int i = 0; i < isimler.size(); i++) {
            String name = isimler.get(i);
            System.out.println(i + ". " + name);
        }

        isimler.remove(4);
        isimler.add(4, "Uras");

        for (int i = 0; i < isimler.size(); i++) {
            String name = isimler.get(i);
            System.out.println(i + ". " + name);
        }

    }
}
