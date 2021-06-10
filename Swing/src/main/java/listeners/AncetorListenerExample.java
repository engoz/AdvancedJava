package listeners;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

/**
 * Created by enginoz on 04/03/17.
 */
public class AncetorListenerExample {
    public static void main(String[] a) {
        JFrame frame = new JFrame("Ancestor Sampler");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AncestorListener ancestorListener = new AncestorListener() {
            public void ancestorAdded(AncestorEvent ancestorEvent) {
                System.out.println("Added");
            }

            public void ancestorMoved(AncestorEvent ancestorEvent) {
                System.out.println("Moved");
            }

            public void ancestorRemoved(AncestorEvent ancestorEvent) {
                System.out.println("Removed");
            }
        };
        frame.getRootPane().addAncestorListener(ancestorListener);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.getRootPane().setVisible(false);
        frame.getRootPane().setVisible(true);
    }
}
