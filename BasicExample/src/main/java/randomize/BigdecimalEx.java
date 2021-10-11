package randomize;

import java.math.BigDecimal;

public class BigdecimalEx {
    public static void main(String[] args) {
        System.out.println(generateRandomBigDecimalFromRange(new BigDecimal(10.25),new BigDecimal(10.30)));
    }
    public static BigDecimal generateRandomBigDecimalFromRange(BigDecimal min, BigDecimal max) {
        BigDecimal randomBigDecimal = min.add(new BigDecimal(Math.random()).multiply(max.subtract(min)));
        return randomBigDecimal.setScale(4,BigDecimal.ROUND_HALF_UP);
    }
}
