package tabdemo;

/**
 * Created by servicium on 30.06.2016.
 */

import util.Util;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * --------------------- @author nguyenvanquan7826 ---------------------
 * ------------------ website: nguyenvanquan7826.com -------------------
 * ---------- date: Jul 24, 2014 - filename: DemoCustomJTabPane.java ----------
 */
public class DemoCustomJTabbedPane extends JFrame {
    JTabbedPane tabbedPane;
    int numTabs;
    private Image tabBackground = Util.getCommonIcon(this, "BottomTab.png").getImage();
    private Icon addIcon = Util.getCommonIcon(this, "AddTab.png");

    public DemoCustomJTabbedPane() {
        createGUI();
        setDisplay();
    }

    /**
     * set diplay for JFrame
     */
    private void setDisplay() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * set title and add JTabbedPane into JFrame
     */
    private void createGUI() {
        setTitle("Demo custum JTabbedPane");
        createJTabbedPane();
        add(tabbedPane);
    }

    /**
     * create JTabbedPane contain 2 tab
     */
    private void createJTabbedPane() {
        /* create JTabbedPane */
        tabbedPane = new JTabbedPane(JTabbedPane.TOP,
                JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbedPane.setUI((DemoTabbedPaneUI) DemoTabbedPaneUI.createUI(tabbedPane));
        /* add first tab */
        tabbedPane.add(createJPanel(), "Tab " + String.valueOf(numTabs),
                numTabs++);
        tabbedPane.setTabComponentAt(0, new DemoCustomTab(this, tabBackground));

        /* add tab to add new tab when click */
        tabbedPane.add(new JPanel(), addIcon, numTabs++);

        tabbedPane.addChangeListener(changeListener);
    }

    /**
     * create JPanel contain a JLabel
     */
    private JPanel createJPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 1));
        panel.add(new JScrollPane(createTextArea(10, 40)));
        return panel;
    }

    private JTextArea createTextArea(int row, int col) {
        JTextArea ta = new JTextArea(row, col);
        ta.setWrapStyleWord(true);
        ta.setLineWrap(true);
        ta.setForeground(Color.RED);
        return ta;
    }

    ChangeListener changeListener = new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
            addNewTab();
            JTabbedPane pane = (JTabbedPane) e.getSource();
            System.out.println(pane.getSelectedIndex());
            System.out.println(pane.getSelectedComponent());
        }
    };

    private void addNewTab() {
        int index = numTabs - 1;
        if (tabbedPane.getSelectedIndex() == index) { /* if click new tab */
            /* add new tab */
            tabbedPane.add(createJPanel(), "Tab " + String.valueOf(index),
                    index);
            /* set tab is custom tab */
            tabbedPane.setTabComponentAt(index, new DemoCustomTab(this, tabBackground));
            tabbedPane.removeChangeListener(changeListener);
            tabbedPane.setSelectedIndex(index);
            tabbedPane.addChangeListener(changeListener);
            numTabs++;
        }
    }

    public void removeTab(int index) {
        tabbedPane.remove(index);
        numTabs--;

        if (index == numTabs - 1 && index > 0) {
            tabbedPane.setSelectedIndex(numTabs - 2);
        } else {
            tabbedPane.setSelectedIndex(index);
        }

        if (numTabs == 1) {
            addNewTab();
        }
    }

    public static void main(String[] args) {
        new DemoCustomJTabbedPane();
    }
}
