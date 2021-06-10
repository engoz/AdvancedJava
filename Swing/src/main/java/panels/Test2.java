package panels;

import javax.swing.*;
import java.awt.*;

/**
 * Created by servicium on 09.11.2016.
 */
public class Test2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(null);
        f.setDefaultCloseOperation(3);
        f.setSize(500, 500);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(15, 15);
                int width = getWidth();
                int height = getHeight();
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


                //Draws the rounded opaque panel with borders.
                graphics.setColor(getBackground());
                graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);//paint background
                graphics.setColor(getForeground());
                graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);//paint border
            }
        };
        p.setBounds(10, 10, 100, 30);
        p.setOpaque(false);
        f.getContentPane().setBackground(Color.red);
        f.add(p);
        f.show();
    }
}
