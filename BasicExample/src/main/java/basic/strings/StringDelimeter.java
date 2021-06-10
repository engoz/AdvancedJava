package basic.strings;

/**
 * Created by servicium on 20.07.2016.
 */
public class StringDelimeter {
    public static void main(String[] args) {


        String string = "Ram is going to school";
        String[] arrayOfString = string.split("\\s+");
        for (String s : arrayOfString) {
            System.out.println(s);
        }
    }
}
