package tree;

/**
 * Created by servicium on 16.08.2016.
 */

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.UIManager;

/**
 * @see http://stackoverflow.com/questions/5260223
 */
public class JTreeLite {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            //@Override
            public void run() {
                createGUI();
            }
        });
    }

    private static void createGUI() {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Icon empty = new TreeIcon();
        UIManager.put("Tree.closedIcon", empty);
        UIManager.put("Tree.openIcon", empty);
        UIManager.put("Tree.collapsedIcon", empty);
        UIManager.put("Tree.expandedIcon", empty);
        UIManager.put("Tree.leafIcon", empty);

        JTree jt = new JTree();
        frame.add(jt);
        frame.pack();
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}

class TreeIcon implements Icon {

    private static int SIZE = 0;

    public TreeIcon() {
    }

    public int getIconWidth() {
        return SIZE;
    }

    public int getIconHeight() {
        return SIZE;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        System.out.println(c.getWidth() + " " + c.getHeight() + " " + x + " " + y);
    }
}
