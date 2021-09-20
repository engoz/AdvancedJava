package basic.numbers.bigdecimals;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalRounding {

    public static void main(String[] args)
    {
        // Assign value to BigDecimal object b1
        BigDecimal b1 = new BigDecimal("4.2445");

        MathContext m = new MathContext(2); // 4 precision

        // b1 is rounded using m
        BigDecimal b2 = b1.round(m);

        // Print b2 value
        System.out.println("The value of " + b1 +
                " after rounding is " + b2);

        // Assigning value to BigDecimal object b1
        BigDecimal b3 = new BigDecimal("-4.2585");

        MathContext m1 = new MathContext(4); // 4 precision

        // b1 is rounded using m
        BigDecimal b4 = b1.round(m);

        // Print b2 value
        System.out.println("The value of " + b1 +
                " after rounding is " + b2);
    }
}
