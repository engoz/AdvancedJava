package layout;

import frame.ComponentResizer;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by servicium on 02.08.2016.
 */
public class GBDemo2 {

    protected static final Color HEADER_COLOR = Color.decode("#1c1e22");
    private JPanel headerPanel, emptyPanel;
    protected static final Color BACK_COLOR = Color.decode("#1f2229");
    private static final Font headerFont = new Font("Arial", Font.PLAIN, 14);
    private JFrame frame = new JFrame();

    public GBDemo2() {
        headerPanel = new JPanel();
        headerPanel.setLayout(new GridBagLayout());
        headerPanel.setPreferredSize(new Dimension(900, 70));
        headerPanel.setBackground(HEADER_COLOR);

        emptyPanel = new JPanel();
        emptyPanel.setLayout(new FlowLayout());
        emptyPanel.setPreferredSize(new Dimension(900, 20));
        emptyPanel.setBackground(BACK_COLOR);


        JLabel headerLabel = new JLabel("Yardım");
        headerLabel.setPreferredSize(new Dimension(100, 20));
        headerLabel.setFont(headerFont);

        JLabel closeButton = new JLabel(" X ");
        closeButton.setSize(new Dimension(12, 12));
        closeButton.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                System.exit(0);
            }
        });


        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1.0;
        c.insets = new Insets(10, 10, 0, 0);  //top padding
        c.anchor = GridBagConstraints.WEST;
        headerPanel.add(headerLabel, c);


        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1.0;
        c.insets = new Insets(10, 0, 0, 10);  //top padding
        c.anchor = GridBagConstraints.EAST;
        headerPanel.add(closeButton, c);


        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 1.0;
        c.gridwidth = 2;
        c.insets = new Insets(10, 0, 0, 0);  //top padding
        headerPanel.add(emptyPanel, c);
    }

    class OutsidePanel extends JPanel {

        public OutsidePanel() {
            setLayout(new BorderLayout());

            JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
            JPanel panel = new JPanel();
            panel.setBackground(Color.YELLOW);
            panel.setPreferredSize(new Dimension(300, 400));
            splitPane.setLeftComponent(panel);
            panel = new JPanel();
            panel.setBackground(Color.BLUE);
            panel.setPreferredSize(new Dimension(600, 400));
            splitPane.setRightComponent(panel);
            splitPane.setContinuousLayout(true);
            splitPane.setOneTouchExpandable(true);
            splitPane.setDividerLocation(300);
            splitPane.setDividerSize(0);
            add(splitPane, BorderLayout.CENTER);
            add(headerPanel, BorderLayout.PAGE_START);
            setBorder(new LineBorder(Color.BLACK, 5));
        }
    }

    private void closeButtonActionPerformed(ActionEvent actionEvent) {
        frame.dispose();
    }


    private void createAndShowGui() {
        ComponentResizer cr = new ComponentResizer();
        cr.setMinimumSize(new Dimension(300, 300));
        cr.setMaximumSize(new Dimension(800, 600));
        cr.registerComponent(frame);
        cr.setSnapSize(new Dimension(10, 10));
        frame.setUndecorated(true);
        frame.add(new OutsidePanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GBDemo2().createAndShowGui();
            }
        });
    }


}
