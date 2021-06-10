package compares;

import java.math.BigDecimal;

public class BigDecimalEx {

    public static void main(String[] args) {
        BigDecimal ten = BigDecimal.TEN;

        System.out.println(ten.compareTo(BigDecimal.ZERO) > 0);
        System.out.println(BigDecimal.ZERO.compareTo(BigDecimal.TEN) > 0);

    }
}
