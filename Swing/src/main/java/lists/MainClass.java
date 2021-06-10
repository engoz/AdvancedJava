package lists;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 * Created by servicium on 10.10.2016.
 */
public class MainClass {
    public static void main(String args[]) throws Exception {
        AdjustmentListener adjustmentListener = new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent adjustmentEvent) {
                System.out.println("Adjusted: " + adjustmentEvent.getValue());
            }
        };
        JScrollBar oneJScrollBar = new JScrollBar(JScrollBar.VERTICAL);
        oneJScrollBar.addAdjustmentListener(adjustmentListener);


        JFrame frame = new JFrame("ScrollBars R Us");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(oneJScrollBar, BorderLayout.NORTH);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
