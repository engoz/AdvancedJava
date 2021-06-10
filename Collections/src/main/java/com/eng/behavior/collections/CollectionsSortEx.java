package com.eng.behavior.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author engin.oz
 */
public class CollectionsSortEx {

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(-1);
        sayilar.add(2);
        sayilar.add(-4);

        Collections.sort(sayilar);

        System.out.println(sayilar);
    }
}
