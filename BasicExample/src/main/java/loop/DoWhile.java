package loop;

/**
 * Created by enginoz on 17.05.2018.
 */
public class DoWhile {

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("i = " +i);
            i++;
        }while(i < 0);
        System.out.println("Sayma isi tamamlandi");
    }
}
