package basic.math;

import java.math.BigInteger;

public class ModTest {

    public static void main(String[] args) {

        // create 3 BigInteger objects
        BigInteger bi1, bi2, bi3;

        bi1 = new BigInteger("-100");
        bi2 = new BigInteger("3");

        // perform mod operation on bi1 using bi2
        bi3 = bi1.mod(bi2);

        String str = bi1 + " mod " + bi2 + " is " +bi3;

        // print bi3 value
        System.out.println( str );
    }
}
