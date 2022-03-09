package basic.numbers.bigdecimals;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal("100.40");
        System.out.println(decimal.doubleValue());
        System.out.println(decimal.compareTo(BigDecimal.ZERO) <= 0);

        long eng = 5;
        long tmp = 100;
        for (int i = 0; i < 10; i++) {
            tmp -= eng;
            System.out.println(tmp);
        }

        BigDecimal engB = new BigDecimal(5);
        BigDecimal tmpB = new BigDecimal(100);

        System.out.println("Bigdecimal Ornegi");

        for (int i = 0; i < 10; i++) {
            tmpB = tmpB.subtract(engB);
            System.out.println(tmpB);
        }

        BigDecimal zero = new BigDecimal(0);

        if (zero.compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("Compare calisti");
        }

        if (zero.equals(BigDecimal.ZERO)) {
            System.out.println("Esitter calisti");
        }
        System.out.println("negateEx calisti");
        BigDecimal negateEx = new BigDecimal(100);
        BigDecimal negate = negateEx.negate();
        System.out.println("Negate : " + negate);

        BigDecimal leftTickSize = BigDecimal.valueOf(-1, 0);
        System.out.println(leftTickSize);

    }
}
