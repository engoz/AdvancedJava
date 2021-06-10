package labels;

import javax.swing.*;
import java.awt.*;

/**
 * Created by enginoz on 15.12.2017.
 */
public class BackgroundImageLabel extends JFrame {

    private ImageIcon icon;
    private JLabel label;

    public BackgroundImageLabel() {
        icon = new ImageIcon("images/Common/BottomTab.png");

        label = new JLabel() {
            public void paintComponent(Graphics g) {
                g.drawImage(icon.getImage(), 0, 0, null);
                super.paintComponent(g);
            }
        };
        label.setSize(96, 22);
        label.setOpaque(false);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        getContentPane().add(label);

        label.setText("Text1");
    }

    public static void main(String[] args) {
        BackgroundImageLabel frame = new BackgroundImageLabel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
