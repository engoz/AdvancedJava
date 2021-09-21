package loop;

/**
 * Created by enginoz on 25/09/17.
 */
public class IfTest {
    public static void main(String[] args) {
        String s =  "A";
        checkMessage(s);
    }

    private static void checkMessage(String a){
        if (a.equals("A")){
            return;
        }
        System.out.println(a);

    }
}
