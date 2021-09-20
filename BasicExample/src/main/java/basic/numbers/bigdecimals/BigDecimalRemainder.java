package basic.numbers.bigdecimals;

import java.math.BigDecimal;

public class BigDecimalRemainder {

    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("4.2445");
        //Mutlak Deger
        System.out.println(b1.remainder(new BigDecimal(1)));
    }
}
