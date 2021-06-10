package com.timur.bolum6.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by enginoz on 12/3/15.
 */
public class ArrayToHashSet {

    public static void main(String[] args) {
        List tekerleme = new ArrayList();
        tekerleme.add("elma");
        tekerleme.add("attim");
        tekerleme.add("denize");
        tekerleme.add("geliyor");
        tekerleme.add("yuze");
        tekerleme.add("yuze");
        tekerleme.add(1);

        Set s = new HashSet(tekerleme);

        for (Object object : s)
            System.out.println(object);

    }

}
