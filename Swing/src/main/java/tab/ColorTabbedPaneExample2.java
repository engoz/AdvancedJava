package tab;

/**
 * Created by servicium on 16.06.2016.
 */

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class ColorTabbedPaneExample2 extends JFrame {

    String[] titles = {"blue", "cyan", "green", "yellow", "orange", "pink",
            "red"};

    Color[] colors = {Color.blue, Color.cyan, Color.green, Color.yellow,
            Color.orange, Color.pink, Color.red};

    JTabbedPane tabbedPane;

    public ColorTabbedPaneExample2() {
        super("ColorTabbedPaneExample (basic)");

        tabbedPane = new ColoredTabbedPane();
        for (int i = 0; i < titles.length; i++) {
            tabbedPane.addTab(titles[i], createPane(titles[i], colors[i]));
            tabbedPane.setBackgroundAt(i, colors[i].darker());
        }
        tabbedPane.setSelectedIndex(0);

        getContentPane().add(tabbedPane);
    }

    JPanel createPane(String title, Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        JLabel label = new JLabel(title);
        label.setOpaque(true);
        label.setBackground(Color.white);
        panel.add(label);
        return panel;
    }

    class ColoredTabbedPane extends JTabbedPane {
        public Color getBackgroundAt(int index) {
            if (index == getSelectedIndex()) {
                return colors[index];
            } else {
                return super.getBackgroundAt(index);
            }
        }


    }

    public static void main(String[] args) {
        JFrame frame = new ColorTabbedPaneExample2();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(360, 100);
        frame.setVisible(true);
    }
}
