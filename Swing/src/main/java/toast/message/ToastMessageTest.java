package toast.message;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by enginoz on 28/02/17.
 */
public class ToastMessageTest extends JFrame {

    ToastMessageManager toastMessageManager = new ToastMessageManager(getOwner());

    public ToastMessageTest() {
        super();

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton toastButton = new JButton("show toast");
        jPanel.add(toastButton);


        toastButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    toastMessageManager.creatToastMessage();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }

            }
        });


        add(jPanel);
        setSize(800, 600);
        setVisible(true);
    }


    public JFrame getOwner() {
        return this;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToastMessageTest();
            }
        });
    }

}
