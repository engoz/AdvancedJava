package split;

/**
 * Created by servicium on 02.08.2016.
 */

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class TouchExpandableSplitPane {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Property Split");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        splitPane.setContinuousLayout(true);
        splitPane.setOneTouchExpandable(true);
        JComponent topComponent = new JButton("A");
        splitPane.setTopComponent(topComponent);
        JComponent bottomComponent = new JButton("B");
        splitPane.setBottomComponent(bottomComponent);
        frame.add(splitPane, BorderLayout.CENTER);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
