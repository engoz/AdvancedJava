package dialogs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutDialog extends JDialog implements ActionListener {

    private JButton closeButton;
    private JButton resizeButton;
    private int width = 100, height = 100;

    public AboutDialog(JFrame parent, String title, String message) {
        super(parent, title, true);
        if (parent != null) {
            Dimension parentSize = parent.getSize();
            Point p = parent.getLocation();
            setLocation(p.x + parentSize.width / 4, p.y + parentSize.height / 4);
        }
        JPanel messagePane = new JPanel();
        messagePane.add(new JLabel(message));
        getContentPane().add(messagePane);
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        closeButton = new JButton("OK");
        resizeButton = new JButton("Resize");
        buttonPane.add(closeButton);
        buttonPane.add(resizeButton);
        resizeButton.addActionListener(this);
        closeButton.addActionListener(this);
        getContentPane().add(buttonPane, BorderLayout.SOUTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resizeButton) {
            width = width * 2;
            height = height * 2;
            Dimension dimension = new Dimension(width, height);
            this.setPreferredSize(dimension);
            this.setSize(dimension);
        } else if (e.getSource() == closeButton) {
            setVisible(false);
            dispose();
        } else {

        }

    }

    public static void main(String[] a) {
        AboutDialog dlg = new AboutDialog(new JFrame(), "title", "message");
    }
}
