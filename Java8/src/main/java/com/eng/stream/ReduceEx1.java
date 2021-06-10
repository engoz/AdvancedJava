package com.eng.stream;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReduceEx1 {

    private static Logger LOGGER = Logger.getLogger(ReduceEx1.class.getName());

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(result);

        int result2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(result2);
    }

    public static int divideListElementsWithDivide(List<Integer> values, int divider) {
        return values.stream().reduce(0, (a, b) -> divide(a, divider) + divide(b, divider));
    }

    public static int divideListElements(List<Integer> values, int divider) {
        return values.stream()
                .reduce(0, (a, b) -> {
                    try {
                        return a / divider + b / divider;
                    } catch (ArithmeticException e) {
                        LOGGER.log(Level.INFO, "Arithmetic Exception: Division by Zero");
                    }
                    return 0;
                });
    }

    private static int divide(int value, int factor) {
        int result = 0;
        try {
            result = value / factor;
        } catch (ArithmeticException e) {
            LOGGER.log(Level.INFO, "Arithmetic Exception: Division by Zero");
        }
        return result;
    }
}
