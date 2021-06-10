package basic.numbers.bigdecimals;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

/**
 * Created by enginoz on 24/05/17.
 */
public class BigDecimalCompare {

    public static void main(String[] args) {
        BigDecimal result = new BigDecimal(1.0);
        int i = result.compareTo(new BigDecimal(1.0));
        System.out.println(i);
        if (i <= 0) {
            System.out.println("Küçük veya eşit i = " + i);
        } else if (i < 0) {
            System.out.println("Kücük i = " + i);
        }
    }
}
