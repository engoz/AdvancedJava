package com.timur.bolum6.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by enginoz on 10/16/15.
 */
public class VectorToArrayList {


    public static void main(String[] args) {
        List a = new Vector();
        a.add("Paris");
        a.add("Londra");
        a.add("İstanbul");

        System.out.println("Vector" + a);

        List b = new ArrayList();
        b.addAll(a);
        System.out.println("A ArrayList" + b);

        List c = new ArrayList(a);

        System.out.println("B ArrayList " + c);


    }


}
