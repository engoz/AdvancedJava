package basic.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by servicium on 14.07.2016.
 */
public class StringToInt {

    public static void main(String[] args) {
        System.out.println(strToInt2("Engin123"));
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

    public static List<Integer> strToInt2(String str) {
        int i = 0;
        int num = 0;
        boolean isNeg = false;
        List list = new ArrayList();
        //Check for negative sign; if it's there, set the isNeg flag
        if (str.charAt(0) == '-') {
            isNeg = true;
            i = 1;
        }

        //Process each character of the string;
        while (i < str.length()) {
            num = str.charAt(i++);
            if (isNeg)
                num = -num;

            list.add(num);

        }


        return list;
    }

    public void test() {
        // base 10
        Integer.parseInt("12");     // 12 - int
        Integer.valueOf("12");      // 12 - Integer
        Integer.decode("12");       // 12 - Integer
// base 8
// 10 (0,1,...,7,10,11,12)
        Integer.parseInt("12", 8);  // 10 - int
        Integer.valueOf("12", 8);   // 10 - Integer
        Integer.decode("012");      // 10 - Integer
// base 16
// 18 (0,1,...,F,10,11,12)
        Integer.parseInt("12", 16);  // 18 - int
        Integer.valueOf("12", 16);   // 18 - Integer
        Integer.decode("#12");      // 18 - Integer
        Integer.decode("0x12");     // 18 - Integer
        Integer.decode("0X12");     // 18 - Integer
// base 2
        Integer.parseInt("11", 2);   // 3 - int
        Integer.valueOf("11", 2);
    }

    static public Integer str2Int(String str) {
        Integer result = null;
        if (null == str || 0 == str.length()) {
            return null;
        }
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String negativeMode = "";
            if (str.indexOf('-') != -1)
                negativeMode = "-";
            str = str.replaceAll("-", "");
            if (str.indexOf('.') != -1) {
                str = str.substring(0, str.indexOf('.'));
                if (str.length() == 0) {
                    return (Integer) 0;
                }
            }
            String strNum = str.replaceAll("[^\\d]", "");
            if (0 == strNum.length()) {
                return null;
            }
            result = Integer.parseInt(negativeMode + strNum);
        }
        return result;
    }

    public static Integer strInt(String stringValue) {
        try {

            // From String to Integer
            int integerValue = Integer.valueOf(stringValue);

            // Or
            int integerValue2 = Integer.parseInt(stringValue);

            // Now from integer to back into string
            String sValue = String.valueOf(integerValue);
            return integerValue;
        } catch (NumberFormatException ex) {
            //JOptionPane.showMessageDialog(frame, "Invalid input string!");
            System.out.println("Invalid input string!");
            return -1;
        }

    }
}
