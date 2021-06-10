package basic.strings;

/**
 * Created by enginoz on 15/08/17.
 */
public class StringEquals2 {
    public static void main(String args[]) {
        String Str1 = null;
        String Str3 = new String("This is really not immutable!!");

        boolean retVal;

        retVal = Str1.equalsIgnoreCase(Str3);
        System.out.println("Returned Value = " + retVal);

    }
}
