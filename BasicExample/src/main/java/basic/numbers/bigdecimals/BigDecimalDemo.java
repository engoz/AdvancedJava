package basic.numbers.bigdecimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {

        // create 3 BigDecimal objects
        BigDecimal bg1, bg2, bg3;

        bg1 = new BigDecimal("235");
        bg2 = new BigDecimal("236");

        // assign the min value of bg1, bg2 to bg3
        bg3 = bg1.min(bg2);

        String str = "Minimum Value among " + bg1 + " and " + bg2 + " is " + bg3;

        BigDecimal value = new BigDecimal("11.2");
        int intValue = value.setScale(0, RoundingMode.UP).intValue();
        System.out.println("Raoundig UP " + intValue);
        // print the minimum value
        System.out.println("Abs : " + value.abs());

        System.out.println(str);
    }
}
