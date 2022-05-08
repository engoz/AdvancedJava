package loop;

/**
 * Created by servicium on 09.07.2016.
 */
public class BreakTest2 {
    public static void main(String[] args) {
        kiril:
        for(int i=0; i<10; i++){
            for(int j=0; j<100; j++){
                if(j==9){
                    break kiril;
                }
                System.out.println("i ="+i+", j= "+j);
            }
        }
        System.out.println("Etiket dışı");
    }
}
