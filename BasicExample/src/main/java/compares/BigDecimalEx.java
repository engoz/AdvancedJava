package compares;

import java.math.BigDecimal;

public class BigDecimalEx {

    public static void main(String[] args) {
        BigDecimal ten = BigDecimal.TEN;

        System.out.println(ten.compareTo(BigDecimal.ZERO) > 0);
        System.out.println(BigDecimal.ZERO.compareTo(BigDecimal.TEN) > 0);
        compare();
    }

    public static void compare(){
        BigDecimal stopLoss = new BigDecimal(-5);
        BigDecimal takeProfit = new BigDecimal(10);
        BigDecimal totalProfit = new BigDecimal(-3000);
        boolean condition1 =(stopLoss.compareTo(BigDecimal.ZERO) != 0 && totalProfit.compareTo(stopLoss) <= 0);
        boolean condition2 =(takeProfit.compareTo(BigDecimal.ZERO) != 0 && totalProfit.compareTo(takeProfit) >= 0);

        boolean close = condition1 || condition2;
        System.out.println("stopLoss.compareTo(BigDecimal.ZERO) != 0 && totalProfit.compareTo(stopLoss) <= 0 -> " + condition1);
        System.out.println("takeProfit.compareTo(BigDecimal.ZERO) != 0 && totalProfit.compareTo(takeProfit) >= 0-> " + condition2);
        System.out.println("Close  " + close);
    }
}
