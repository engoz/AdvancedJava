package graphics.book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by enginoz on 05/03/17.
 */
public class EkranaYaziYaz extends JFrame {

    public EkranaYaziYaz() {
        setSize(new Dimension(450, 100));
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.drawString("Grafik Yazısı", 150, 60);
    }

    public static void main(String[] args) {
        new EkranaYaziYaz().setVisible(true);
    }
}
