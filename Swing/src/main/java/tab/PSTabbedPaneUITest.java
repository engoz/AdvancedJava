package tab;

import javax.swing.*;
import java.awt.*;

/**
 * Created by servicium on 16.06.2016.
 */
public class PSTabbedPaneUITest extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PSTabbedPaneUITest().initialize();
            }
        });


    }

    public void initialize() {


        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception exc) {
// Do nothing...
        }
        setLocationRelativeTo(null);
        setTitle("Tabs Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        JTabbedPane vTab = new JTabbedPane();
        vTab.setUI(new PSTabbedPaneUI());

        vTab.add("One", new JPanel());
        JPanel vPanel2 = new JPanel();
        vPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        vPanel2.setBackground(Color.GREEN);
        vTab.add("Two", vPanel2);
        vTab.add("Three", new JButton("three"));

        getContentPane().add(vTab);
        setVisible(true);
    }
}
