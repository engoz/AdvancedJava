package com.timur.bolum5.vectors;

import java.util.Vector;

/**
 * Created by enginoz on 10/13/15.
 */
public class VectorAddDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("bir");
        vector.add("iki");
        vector.add("uc");
        vector.add("dort");
        vector.add("bes");

        //araya ekleme
        vector.add(3, "ara");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Vektor ogesi " + i + " " + vector.get(i));
        }
    }
}
