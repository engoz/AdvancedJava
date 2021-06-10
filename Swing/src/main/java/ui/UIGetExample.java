package ui;

/**
 * Created by enginoz on 21.12.2017.
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

public class UIGetExample {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Active Example");
        UIManager.put("LabelFactory", new ActiveLabel());
        final JPanel panel = new JPanel();
        JButton button = new JButton("Get");
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                JLabel label = (JLabel) UIManager.get("LabelFactory");
                panel.add(label);
                panel.revalidate();
            }
        };
        button.addActionListener(actionListener);

        Container contentPane = frame.getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(button, BorderLayout.SOUTH);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}

class ActiveLabel implements UIDefaults.ActiveValue {
    private int counter = 0;

    public Object createValue(UIDefaults defaults) {
        JLabel label = new JLabel("" + counter++);
        return label;
    }
}
