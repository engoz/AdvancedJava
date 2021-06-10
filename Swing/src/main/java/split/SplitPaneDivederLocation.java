package split;

import javax.swing.*;
import java.awt.*;

/**
 * Created by servicium on 02.08.2016.
 */
public class SplitPaneDivederLocation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SplitPaneFrame");
        JLabel leftImage = new JLabel(new ImageIcon("a.gif"));
        Component left = new JScrollPane(leftImage);
        JLabel rightImage = new JLabel(new ImageIcon("b.gif"));
        Component right = new JScrollPane(rightImage);
        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, left, right);
        split.setDividerLocation(100);
        frame.getContentPane().add(split);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
