package frame;

/**
 * Created by servicium on 02.08.2016.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class TestResizer extends JFrame {


    class MainPanel extends JPanel {

        public MainPanel() {
            setLayout(new BorderLayout());
            setBackground(Color.gray);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(400, 400);
        }
    }

    class BorderPanel extends JPanel {

        private JLabel label;
        int pX, pY;

        public BorderPanel() {
            label = new JLabel(" X ");
            label.setOpaque(true);
            label.setBackground(Color.RED);
            label.setForeground(Color.WHITE);

            setBackground(Color.black);
            setLayout(new FlowLayout(FlowLayout.RIGHT));

            add(label);

            label.addMouseListener(new MouseAdapter() {
                public void mouseReleased(MouseEvent e) {
                    System.exit(0);
                }
            });
            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent me) {
                    // Get x,y and store them
                    pX = me.getX();
                    pY = me.getY();

                }

                public void mouseDragged(MouseEvent me) {

                    getContainer().setLocation(getContainer().getLocation().x + me.getX() - pX,
                            getContainer().getLocation().y + me.getY() - pY);
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent me) {

                    getContainer().setLocation(getContainer().getLocation().x + me.getX() - pX,
                            getContainer().getLocation().y + me.getY() - pY);
                }
            });
        }
    }

    class OutsidePanel extends JPanel {

        public OutsidePanel() {
            setLayout(new BorderLayout());

            JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
            JPanel panel = new JPanel();
            panel.setBackground(Color.YELLOW);
            panel.setPreferredSize(new Dimension(200, 400));
            splitPane.setLeftComponent(panel);
            panel = new JPanel();
            panel.setBackground(Color.BLUE);
            panel.setPreferredSize(new Dimension(200, 400));
            splitPane.setRightComponent(panel);
            splitPane.setContinuousLayout(true);
            splitPane.setOneTouchExpandable(true);
            splitPane.setDividerLocation(200);
            splitPane.setDividerSize(0);
            add(splitPane, BorderLayout.CENTER);
            add(new BorderPanel(), BorderLayout.PAGE_START);
            setBorder(new LineBorder(Color.BLACK, 5));
        }
    }

    private void createAndShowGui() {
        ComponentResizer cr = new ComponentResizer();
        cr.setMinimumSize(new Dimension(300, 300));
        cr.setMaximumSize(new Dimension(800, 600));
        cr.registerComponent(getContainer());
        cr.setSnapSize(new Dimension(10, 10));
        setUndecorated(true);
        add(new OutsidePanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TestResizer().createAndShowGui();
            }
        });
    }

    protected JFrame getContainer() {
        return this;
    }
}

