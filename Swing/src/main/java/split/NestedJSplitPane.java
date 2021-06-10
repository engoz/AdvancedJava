package split;

/**
 * Created by servicium on 02.08.2016.
 */

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

public class NestedJSplitPane {

    public static void main(String[] a) {
        int HORIZSPLIT = JSplitPane.HORIZONTAL_SPLIT;
        int VERTSPLIT = JSplitPane.VERTICAL_SPLIT;
        boolean continuousLayout = true;

        JLabel label1 = new JLabel("a");
        JLabel label2 = new JLabel("b");
        JLabel label3 = new JLabel("c");
        JSplitPane splitPane1 = new JSplitPane(VERTSPLIT, continuousLayout, label1, label2);
        splitPane1.setOneTouchExpandable(true);
        splitPane1.setDividerSize(2);
        splitPane1.setDividerLocation(0.5);
        JSplitPane splitPane2 = new JSplitPane(HORIZSPLIT, splitPane1, label3);
        splitPane2.setOneTouchExpandable(true);
        splitPane2.setDividerLocation(0.4);
        splitPane2.setDividerSize(2);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(splitPane2);
        frame.pack();
        frame.setVisible(true);
    }
}


