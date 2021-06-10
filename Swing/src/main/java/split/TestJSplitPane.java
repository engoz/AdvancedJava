package split;

/**
 * Created by servicium on 02.08.2016.
 */

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class TestJSplitPane {
    private void init() {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setRightComponent(new JButton("Here I Am"));
        splitPane.setLeftComponent(new JButton("Me Too"));
        splitPane.setContinuousLayout(true);
        splitPane.setOneTouchExpandable(true);
        frame.add(splitPane, BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TestJSplitPane().init();
    }
}
