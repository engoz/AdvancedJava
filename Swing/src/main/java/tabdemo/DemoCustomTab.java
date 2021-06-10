package tabdemo;

/**
 * Created by servicium on 30.06.2016.
 */

import util.Util;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

/**
 * --------------------- @author nguyenvanquan7826 ---------------------
 * ------------------ website: nguyenvanquan7826.com -------------------
 * ---------- date: Jul 24, 2014 - filename: DemoButtonTab.java ----------
 */
public class DemoCustomTab extends JPanel {

    DemoCustomJTabbedPane customJTabbedPane;
    private Image tabBackground;
    private Icon arrow = Util.getCommonIcon(this, "Arrow.png");

    /**
     * JPanel contain a JLabel and a JButton to close
     */
    public DemoCustomTab(DemoCustomJTabbedPane customJTabbedPane, Image tabBackground) {
        this.customJTabbedPane = customJTabbedPane;
        this.tabBackground = tabBackground;
        setLayout(null);
        setBorder(new EmptyBorder(0, 0, 0, 0));
        addLabel();
        Dimension dim = new Dimension(tabBackground.getWidth(this), tabBackground.getHeight(this));
        setSize(dim);
        setPreferredSize(dim);
        JButton button = new CustomButton(arrow);
        button.setBounds(dim.width - 25, 5, 17, 17);
        add(button);
    }

    private void addLabel() {
        JLabel label = new JLabel() {
            /** set text for JLabel, it will title of tab */
            public String getText() {
                int index = customJTabbedPane.tabbedPane
                        .indexOfTabComponent(DemoCustomTab.this);
                if (index != -1) {
                    return customJTabbedPane.tabbedPane.getTitleAt(index);
                }
                return null;
            }
        };
        /** add more space between the label and the button */
        label.setBounds(5, 3, 60, 20);
        label.setForeground(Color.WHITE);
        add(label);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (tabBackground != null) {
            g.drawImage(tabBackground, 0, 0, null);
        }
    }

    class CustomButton extends JButton implements MouseListener {
        public CustomButton(Icon icon) {
            int size = 15;
            setIcon(icon);
            /** set size for button close */
            setPreferredSize(new Dimension(size, size));

            setToolTipText("close the Tab");

            /** set transparent */
            setContentAreaFilled(false);

            /** set border for button */
            setBorder(null);
            /** don't show border */
            setBorderPainted(false);

            setFocusable(false);

            /** add event with mouse */
            addMouseListener(this);

        }

        /**
         * when click button, tab will close
         */

        public void mouseClicked(MouseEvent e) {
            int index = customJTabbedPane.tabbedPane
                    .indexOfTabComponent(DemoCustomTab.this);
            if (index != -1) {
                customJTabbedPane.removeTab(index);
            }
        }


        public void mousePressed(MouseEvent e) {
        }


        public void mouseReleased(MouseEvent e) {
        }

        /**
         * show border button when mouse hover
         */

        public void mouseEntered(MouseEvent e) {
            setBorderPainted(true);
            setForeground(Color.RED);
        }

        /**
         * hide border when mouse not hover
         */

        public void mouseExited(MouseEvent e) {
            setBorderPainted(false);
            setForeground(Color.BLACK);
        }
    }
}
