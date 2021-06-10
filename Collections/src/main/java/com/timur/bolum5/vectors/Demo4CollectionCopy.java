package com.timur.bolum5.vectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

/**
 * Created by enginoz on 10/15/15.
 */
public class Demo4CollectionCopy {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");

        Vector v = new Vector();
        v.add("aa");
        v.add("bb");
        v.add("cc");
        v.add("dd");
        v.add("ee");
        v.add("ff");

        System.out.println("kopyalanmadan once vektor" + v);
        Collections.copy(v, arr);
        System.out.println("kopyalandiktan sonra vektor" + v);

    }
}
