package basic.numbers.bigdecimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalMathEx {
    public static void main(String[] args) {
        BigDecimal offer = new BigDecimal(3.5);
        BigDecimal bid = new BigDecimal(1.5);

        BigDecimal value = offer.subtract(bid).divide(offer.add(bid), 6, RoundingMode.HALF_UP);
        System.out.println(value);
    }
}
