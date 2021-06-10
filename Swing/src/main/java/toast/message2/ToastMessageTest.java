package toast.message2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by enginoz on 28/02/17.
 */
public class ToastMessageTest extends JFrame {

    ToastMessageManager toastMessageManager = ToastMessageManager.getInstance();
    private static JLayeredPane layeredPane;
    private JPanel jPanel;


    public ToastMessageTest() {
        super();
        layeredPane = new JLayeredPane();
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton toastButton = new JButton("show toast");
        jPanel.add(toastButton);
        jPanel.setSize(800, 600);

        toastButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                toastMessageManager.creatToastMessage();


            }
        });

        add(jPanel);
        layeredPane.add(jPanel);
        setContentPane(layeredPane);
        setSize(800, 600);
        setVisible(true);
    }


    public ToastMessageTest getOwner() {
        return this;
    }

    public static JLayeredPane getContainer() {
        return layeredPane;
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
