package listex;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseEx {
    public static void main(String[] args) {

        List offerList = Arrays.asList(new BigDecimal(7.35796), new BigDecimal(7.35400));
        Collections.sort(offerList);
        System.out.println("Offer " + offerList);

        List bidList = Arrays.asList(new BigDecimal(7.34961), new BigDecimal(7.34700));
        Collections.sort(bidList, Collections.reverseOrder());
        System.out.println("Reverse " + bidList);
    }
}
