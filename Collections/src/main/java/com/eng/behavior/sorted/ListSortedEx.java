package com.eng.behavior.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by enginoz on 8.12.2017.
 */
public class ListSortedEx {

    public static void main(String[] args) {
        List<MyObj> intList = Arrays.asList(new MyObj("A", 3), new MyObj("B", 25), new MyObj("C", 9), new MyObj("F", 3), new MyObj("D", 21), new MyObj("F", 8), new MyObj("G", 2));
        intList.sort(new Comparator<MyObj>() {
            @Override
            public int compare(MyObj v1, MyObj v2) {
                if (v1.getValue() > v2.getValue()) {
                    return 1;
                } else if (v1.getValue() < v2.getValue()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        intList.forEach(o -> {
            System.out.println(o.getName() + " - " + o.getValue());
        });

    }


    public static class MyObj {
        String name;
        Integer value;

        public MyObj(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }
}
