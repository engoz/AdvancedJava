package toast.movingsquere;

/**
 * Created by enginoz on 28/02/17.
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MovingSquareExample {

    private static final JPanel square = new JPanel();
    private static int x = 20;

    public static void createAndShowGUI() {
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(square);
        square.setBounds(20, 200, 100, 100);
        square.setBackground(Color.RED);

        Timer timer = new Timer(1000 / 60, new MyActionListener());
        timer.start();
        frame.setVisible(true);
    }

    public static class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            square.setLocation(x++, 200);

        }

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();

            }
        });


    }

}
