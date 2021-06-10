package othertab;

import util.Util;

import javax.swing.*;
import java.awt.*;

/**
 * Created by enginoz on 6/29/16.
 */
public class TabComponentsDemo extends JFrame {

    private final int tabNumber = 5;
    private final JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP,
            JTabbedPane.SCROLL_TAB_LAYOUT);
    private ImageIcon tabBackground = Util.getCommonIcon(this, "BottomTab.png");
    private ImageIcon tabSelected = Util.getCommonIcon(this, "BottomTabSelected2.png");
    private ImageIcon tabAdd = Util.getCommonIcon(this, "AddTab.png");
    private ImageIcon tabAddSelected = Util.getCommonIcon(this, "AddTab-C.png");
    private ImageIcon tabAddHover = Util.getCommonIcon(this, "AddTab-H.png");


    public TabComponentsDemo(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(pane);
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
                new TabComponentsDemo("TabComponentsDemo").runTest();
            }
        });
    }

    public void runTest() {
        pane.removeAll();
        for (int i = 0; i < tabNumber; i++) {
            String title = "Tab " + i;
            pane.add(title, new JLabel(title));
            if (i == tabNumber - 1) {
                //    initTabComponent(i,tabAdd,tabAddSelected,tabAddHover);
            } else {
                initTabComponent(i, tabBackground, tabSelected, tabSelected);
            }

        }

        pane.setTabLayoutPolicy(JTabbedPane.TOP);

        setSize(new Dimension(400, 200));
        setLocationRelativeTo(null);
        setVisible(true);
    }


    private void initTabComponent(int i, ImageIcon tabBackground, ImageIcon tabSelected, ImageIcon tabHover) {
        pane.setTabComponentAt(i,
                new ButtonTabComponent(pane, tabBackground, tabSelected, tabHover));
    }

}
