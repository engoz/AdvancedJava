package basic.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by enginoz on 10/08/17.
 */
public class StringSplitText {
    public static void main(String[] args) {
        subStringEx1();
    }

    public static void subStringEx1() {
        String textSp = "USD/TRY";
        System.out.println(textSp.split("/")[1]);
        System.out.println(textSp.indexOf("/"));
        String[] sp = textSp.split("/");
        System.out.println(sp[1]);
    }


    public static void subStringEx2() {
        String textSp = "-175300-175300";
        System.out.println(textSp.indexOf("-"));
        String[] sp = textSp.split("-");
        if (sp.length < 1) System.out.println("Hata");

        Set<String> accounts = new HashSet<>();
        for (String s : sp) {
            if (!accounts.contains(s)) {
                accounts.add(s);
                System.out.println(s);
            }
        }
    }

}
