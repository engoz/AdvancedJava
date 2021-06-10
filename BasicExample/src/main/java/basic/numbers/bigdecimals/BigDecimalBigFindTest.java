package basic.numbers.bigdecimals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BigDecimalBigFindTest {

    public static void main(String[] args) {
        List<BigDecimal> list = new ArrayList<>();
        list.add(new BigDecimal(11));
        list.add(new BigDecimal(12));
        list.add(new BigDecimal(15));
        list.add(new BigDecimal(7));
        BigDecimal num = new BigDecimal(12.70);
        int baseQty = num.intValue();
        System.out.println("Rapunding Up " + baseQty);
        BigDecimal decimalPart = num.subtract(new BigDecimal(baseQty));
        boolean isDecimalQty = decimalPart.compareTo(BigDecimal.ZERO) > 0;
        System.out.println("Decimal Part " + decimalPart);
        BigDecimal big = BigDecimal.ZERO;
        for (BigDecimal o : list) {
            if (o.compareTo(big) > 0) {
                big = o;
            }
        }

        for (BigDecimal o : list) {
            if (isDecimalQty && !big.equals(BigDecimal.ZERO) && o.compareTo(big) == 0) {
                System.out.println("Buldum : " + o.toString());
                BigDecimal newNumber = o.add(decimalPart);
                System.out.println("New Decimal Part Number : " + newNumber);
            }
        }
    }

}
