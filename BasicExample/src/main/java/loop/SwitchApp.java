package loop;

import java.util.Scanner;

/**
 * Created by servicium on 09.07.2016.
 */
public class SwitchApp {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a command");
        String text = input.nextLine();
        switch (text) {
            case "start":
                System.out.println("Machine Started");
                break;
            case "stop":
                System.out.println("Machine Stop");
                break;
            default:
                System.out.println("command not recognized");
                text = input.nextLine();
        }

    }
}
