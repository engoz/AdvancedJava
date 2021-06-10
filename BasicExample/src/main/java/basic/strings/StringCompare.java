package basic.strings;

/**
 * Created by enginoz on 26/09/17.
 */
public class StringCompare {

    public static void main(String args[]) {
        String str1 = "Strings are immutable";
        String str2 = new String("Strings are immutable");
        String str3 = new String("Integers are not immutable");

        int result = str1.compareTo(str2);
        System.out.println(result);

        result = str2.compareTo(str3);
        System.out.println(result);
    }
}
