package com.timur.bolum6.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by enginoz on 10/16/15.
 */
public class ArrayListToVector {

    public static void main(String[] args) {
        List a = new ArrayList();
        a.add("Paris");
        a.add("Londra");
        a.add("İstanbul");

        System.out.println("ArrayList" + a);

        List b = new Vector();
        b.addAll(a);
        System.out.println("A Vector" + b);

        List c = new Vector(a);

        System.out.println("B Vector " + c);


    }
}
