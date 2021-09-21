package loop;

/**
 * Created by servicium on 09.07.2016.
 */
public class Increment {

    public static void main(String []args) {
        Integer i = 10;
        Integer j = 11;
        Integer k = ++i; // INCR
        System.out.println("k == j is " + (k == j));
        System.out.println("k.equals(j) is " + k.equals(j));
    }

}
