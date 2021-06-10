package progress;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SplashScreen extends JWindow {

    private static JProgressBar progressBar = new JProgressBar();
    private static SplashScreen splashScreen;
    private static int count = 1, TIMER_PAUSE = 25, PROGBAR_MAX = 100;
    private static Timer progressBarTimer;
    ActionListener al = new ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
            progressBar.setValue(count);
            System.out.println(count);
            if (PROGBAR_MAX == count) {
                splashScreen.dispose();//dispose of splashscreen
                progressBarTimer.stop();//stop the timer
                createAndShowFrame();
            }
            count++;//increase counter

        }
    };

    public SplashScreen() {
        createSplash();
    }

    private void createSplash() {
        Container container = getContentPane();

        JPanel panel = new JPanel();
        panel.setBorder(new javax.swing.border.EtchedBorder());
        container.add(panel, BorderLayout.CENTER);

        JLabel label = new JLabel("Hello World!");
        label.setFont(new Font("Verdana", Font.BOLD, 14));
        panel.add(label);

        progressBar.setMaximum(PROGBAR_MAX);
        container.add(progressBar, BorderLayout.SOUTH);


        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        startProgressBar();
    }

    private void startProgressBar() {
        progressBarTimer = new Timer(TIMER_PAUSE, al);
        progressBarTimer.start();
    }

    private void createAndShowFrame() {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                splashScreen = new SplashScreen();
            }
        });
    }
}
