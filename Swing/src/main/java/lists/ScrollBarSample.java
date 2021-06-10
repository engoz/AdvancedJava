package lists;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by servicium on 10.10.2016.
 */
public class ScrollBarSample {
    public static void main(String args[]) {
        AdjustmentListener adjustmentListener = new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent adjustmentEvent) {
                System.out.println("Adjusted: " + adjustmentEvent.getValue());
            }
        };
        JScrollBar oneJScrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
        oneJScrollBar.addAdjustmentListener(adjustmentListener);

        ChangeListener changeListener = new BoundedChangeListener();
        JScrollBar anotherJScrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
        BoundedRangeModel model = anotherJScrollBar.getModel();
        model.addChangeListener(changeListener);

        JFrame theFrame = new ExitableJFrame("ScrollBars R Us");
        Container contentPane = theFrame.getContentPane();
        contentPane.add(oneJScrollBar, BorderLayout.NORTH);
        contentPane.add(anotherJScrollBar, BorderLayout.SOUTH);
        theFrame.setSize(300, 200);
        theFrame.setVisible(true);
    }
}
