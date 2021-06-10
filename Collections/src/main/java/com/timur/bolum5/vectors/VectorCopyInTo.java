package com.timur.bolum5.vectors;

import java.util.Vector;

/**
 * Created by enginoz on 10/14/15.
 */
public class VectorCopyInTo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("A");
        v.add("CB");
        v.add("");
        v.add("4");
        v.add("5");
        v.add("6");
        Object[] o = new Object[6];
        v.copyInto(o);

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i]);
        }
    }
}
