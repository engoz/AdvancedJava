package loop;

/**
 * Created by servicium on 09.07.2016.
 */
public class BreakTest {

    public static void main(String[] args) {
            for(int j=0; j<4; j++){
                if(j==2){
                    break;
                }
                System.out.println("j ="+ j);
            }
        System.out.println("Donguden cikildi");
    }

}
