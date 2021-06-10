package com.eng.behavior.sorted;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by enginoz on 8.12.2017.
 */
public class EnumSortEx {

    public static void main(String[] args) {
        List<UserType> intList = Arrays.asList(UserType.USER, UserType.USER, UserType.USER, UserType.USER, UserType.BACKOFFICE, UserType.SYSTEM, UserType.USER, UserType.TMU, UserType.TRADER);
        Collections.sort(intList, new Comparator<UserType>() {
            @Override
            public int compare(UserType firstType, UserType secondType) {
                if (firstType != secondType) {
                    if (firstType == UserType.USER) {
                        return -1;
                    } else if (secondType == UserType.USER) {
                        return 1;
                    }
                }
                return firstType.ordinal() - secondType.ordinal();

            }
        });
        System.out.println(intList);
        intList.forEach(System.out::println);

    }

}
