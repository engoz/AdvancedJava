package basic.strings;

/**
 * Created by servicium on 20.07.2016.
 */
public class StringSubString {
    public static void main(String[] args) {


        String str = "123456789123456789123";
        String s = str.length() > 29 ? str.substring(0, 29) : str;
        System.out.println(s);
    }
}
