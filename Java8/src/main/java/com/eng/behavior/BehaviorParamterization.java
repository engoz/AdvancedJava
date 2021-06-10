package com.eng.behavior;

import java.util.*;

public class BehaviorParamterization {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //System.out.println(getOddNumbers(numbers));
        System.out.println(getNumbersByBehaviors(numbers,new OddNumbers()));
        System.out.println(getNumbersByBehaviors(numbers,new EvenNumbers()));

        System.out.println(
        getNumbersByBehaviors(numbers, new NumbersPredicate<Integer>() {
            public boolean test(Integer number) {
                return number > 5;
            }
        }));

        List<String> names = Arrays.asList("Enes","Engin",".firat");
        System.out.println(getResultByBehavior(names,n->n.contains("E")));
        System.out.println(getResultByBehavior(numbers,n->n % 2 == 0));


    }



    public static <T> Collection<T> getResultByBehavior(final List<T> list, final NumbersPredicate<T> predicate){
        final Collection<T> result = new ArrayList<>();
        for (T e:list){
            if (predicate.test(e))
                result.add(e);
        }

        return result;
    }

    public static List<Integer> getNumbersByBehaviors(final List<Integer> numbers, final NumbersPredicate<Integer> predicate){
        final List<Integer> result = new ArrayList<Integer>();
        for (Integer number:numbers){
            if (predicate.test(number))
                result.add(number);
        }

        return result;
    }

    public static List<Integer> getOddNumbers(final List<Integer> list){
        final List<Integer> result = new ArrayList<Integer>();
        for (Integer number:list){
            if (number % 2 == 1)
                result.add(number);
        }
        return result;
    }
}
