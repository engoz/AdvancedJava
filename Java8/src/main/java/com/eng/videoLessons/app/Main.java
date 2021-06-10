package com.eng.videoLessons.app;

import com.eng.videoLessons.inf.SimpleInterface;
import com.eng.videoLessons.inf.SimpleWithArgs;


/**
 * Created by enginoz on 26/10/17.
 */
public class Main {

    public static void main(String[] args) {
        SimpleInterface simpleInterface = () -> System.out.println("Doing Something");
        simpleInterface.doSomething();

        SimpleWithArgs simpleWithArgs = (a, b) -> {
            int result = a + b;
            System.out.println("The result is " + result);
        };

        simpleWithArgs.calculate(5, 5);
    }
}
