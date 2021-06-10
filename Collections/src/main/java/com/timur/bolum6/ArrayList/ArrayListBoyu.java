package com.timur.bolum6.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enginoz on 10/16/15.
 */
public class ArrayListBoyu {

    public static void main(String[] args) {
        List a = new ArrayList();
        for (int i = 0; i < 5; i++) {
            a.add(10 * i);
            System.out.println("Ambarın Boyu = " + a.size());

            a.add("Altmis");
            System.out.println("Ambarın Boyu = " + a.size());

            a.set(3, "Besyuz");
            System.out.println("Ambarın Boyu = " + a.size());
            a.remove(3);
            System.out.println("Ambarın Boyu = " + a.size());
            a.clear();
            System.out.println("Ambarın Boyu = " + a.size());
        }
    }
}
