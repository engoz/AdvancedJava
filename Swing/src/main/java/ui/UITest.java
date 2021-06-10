package ui;

/**
 * Created by enginoz on 21.12.2017.
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class UITest {

    public static void main(final String args[]) {
        UIManager.put("OptionPane.cancelButtonText", "Annuler");
        UIManager.put("OptionPane.noButtonText", "Non");
        UIManager.put("OptionPane.okButtonText", "D'accord");
        UIManager.put("OptionPane.yesButtonText", "Oui");

        int result = JOptionPane.showConfirmDialog(new JFrame(),
                "Est-ce que vous avez 18 ans ou plus?", "Choisisez une option",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            System.out.println("Yes");
        } else if (result == JOptionPane.NO_OPTION) {
            System.out.println("No");
        } else if (result == JOptionPane.CANCEL_OPTION) {
            System.out.println("Cancel");
        } else if (result == JOptionPane.CLOSED_OPTION) {
            System.out.println("Closed");
        }
    }

}
