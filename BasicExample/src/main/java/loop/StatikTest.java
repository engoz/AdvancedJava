package loop;

public class StatikTest {
    static {
        {
            {
                System.out.println("Break oncesi.");
                System.out.println("Burasi calismayacak.");
            }
            System.out.println("Burasida calismayacak.");
        }
        System.out.println("Burasi calisacak. Cunku second blogunun disi.");
    }


    public static void main(String args[]){
        System.out.println("ilk");
        boolean t = true;
    }
}
