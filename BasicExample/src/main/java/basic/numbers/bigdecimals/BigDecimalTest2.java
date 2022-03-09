package basic.numbers.bigdecimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest2 {
    public static void main(String[] args) {
        BigDecimal price = new BigDecimal("1.2345667788");
        int rount = price.setScale(3, RoundingMode.HALF_UP).intValue();
        System.out.println(price);
        System.out.println(rount);
    }
}
