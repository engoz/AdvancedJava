package loop;

public class BreakEtik {
    public static void main(String args[]){
        boolean t = true;
        {
          {
               {
                    System.out.println("Break oncesi.");
                    System.out.println("Burasi calismayacak.");
                }
                System.out.println("Burasida calismayacak.");
            }
            System.out.println("Burasi calisacak. Cunku second blogunun disi.");
        }
        System.out.println("en son");
    }
}
