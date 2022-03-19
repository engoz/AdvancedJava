package loop;

public class BreakTest3 {
    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            kiril:
            for(int j=0; j<100; j++){
                if(j==9){
                    break kiril;
                }
                System.out.println("i ="+i+", j= "+j);
            }
        }
    }
}
