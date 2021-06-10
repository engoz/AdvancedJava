package basic.numbers.bigdecimals;

import java.math.BigDecimal;

public class BigDecimalSperarePart {
    public static void main(String[] args) {
        double doubleNumber = 24.04;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(doubleNumber));
        int intValue = bigDecimal.intValue();
        System.out.println("Double Number: " + bigDecimal.toPlainString());
        System.out.println("Integer Part: " + intValue);
        System.out.println("Decimal Part: " + bigDecimal.subtract(
                new BigDecimal(intValue)).toPlainString());
    }

}
