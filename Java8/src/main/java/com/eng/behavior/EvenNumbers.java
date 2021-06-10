package com.eng.behavior;

public class EvenNumbers  implements NumbersPredicate<Integer>{
    public boolean test(Integer number) {
        return number % 2 == 0 ;
    }
}
