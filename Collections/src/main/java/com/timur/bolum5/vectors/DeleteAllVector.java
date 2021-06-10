package com.timur.bolum5.vectors;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by enginoz on 10/14/15.
 */
public class DeleteAllVector {

    public static void main(String[] args) {
        Vector<Object> vector = new Vector<Object>();
        int primitiveType = 100;
        Integer wrapperType = new Integer(200);
        String str = "Baskent Ankara";

        vector.add(primitiveType);
        vector.add(wrapperType);
        vector.add(str);
        vector.add(2, new Integer(200));

        System.out.println("Vektorun ogeleri " + vector);
        vector.clear();
        System.out.println("Vektorun ogeleri " + vector);


    }
}
