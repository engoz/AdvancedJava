package com.timur.bolum6.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enginoz on 10/16/15.
 */
public class ArrayMethod {

    public static void main(String[] args) {
        List a = new ArrayList();
        a.add("On");
        a.add("Yirmi");
        a.add("Otuz");
        a.add("Kirk");
        a.add("Elli");
        a.add("Kirk");

        System.out.println("A = " + a);

        System.out.println(a.isEmpty());
        System.out.println(a.size());
        System.out.println(a.contains("Otuz"));
        System.out.println(a.get(3));
        System.out.println(a.lastIndexOf("Yirmi"));
        System.out.println(a.indexOf("Kirk"));


    }
}
