package basic.numbers.bigdecimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalRaounding {
    public static void main(String[] args) {
        System.out.println(round(new BigDecimal("12.390"), 0, true)); // => 12.39
        System.out.println(round(new BigDecimal("12.391"), 1, true)); // => 12.40
        System.out.println(round(new BigDecimal("12.391"), 2, false)); // => 12.39
        System.out.println(round(new BigDecimal("12.399"), 3, false)); // => 12.39
    }

    public static BigDecimal round(BigDecimal d, int scale, boolean roundUp) {
        RoundingMode mode = (roundUp) ? RoundingMode.UP : RoundingMode.DOWN;
        return d.setScale(scale, mode);
    }
}
