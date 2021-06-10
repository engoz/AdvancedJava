package basic.strings;

/**
 * @author engin.oz
 */
public class StringToInt2 {

    public static void main(String[] arg) {

        String str = "2151642191"; // string max değerden fazla

        System.out.println(Integer.valueOf(str));

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);

    }

    public static int strToInt(String str) {
        int i = 0;
        int num = 0;
        boolean isNeg = false;

        //Check for negative sign; if it's there, set the isNeg flag
        if (str.charAt(0) == '-') {
            isNeg = true;
            i = 1;
        }

        //Process each character of the string;
        while (i < str.length()) {
            num *= 10;
            //    num += str.charAt(i++) - '0'; //Minus the ASCII code of '0' to get the value of the charAt(i++).
            num += str.charAt(i++) - '0';
        }

        if (isNeg)
            num = -num;
        return num;
    }
}
