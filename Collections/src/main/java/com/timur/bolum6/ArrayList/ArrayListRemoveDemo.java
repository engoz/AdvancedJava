package com.timur.bolum6.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enginoz on 10/16/15.
 */
public class ArrayListRemoveDemo {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10);
        }
        System.out.println("ArrayList " + arrayList);
        arrayList.remove(3);

        System.out.println("ArrayList Remove " + arrayList);

        arrayList.ensureCapacity(15);

        for (int i = 0; i < 10; i++) {
            arrayList.add(i * 100);
        }

        System.out.println("ArrayList ensureCapasity" + arrayList);

        List<Integer> subList = arrayList.subList(10, 13);
        System.out.println("SubList " + subList);

        subList.clear();
        System.out.println("Sublist " + subList);
        System.out.println("ArrayList " + arrayList);

        arrayList.subList(5, 8).clear();
        System.out.println("ArrayList Sublist Clear " + arrayList);

        arrayList.trimToSize();
        System.out.println("ArrayList Trimr " + arrayList);

    }

}
