package com.eng.behavior;

public class OddNumbers implements NumbersPredicate<Integer> {
    public boolean test(Integer number) {
        return number % 2 == 1;
    }
}
