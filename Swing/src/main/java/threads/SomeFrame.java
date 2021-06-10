package threads;

/**
 * Created by enginoz on 16/02/17.
 */

import java.awt.BorderLayout;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SomeFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JTextField textField = new JTextField();

    public SomeFrame() {
        getContentPane().add(textField, BorderLayout.CENTER);
    }

    public String getTextFieldValue() {
        if (SwingUtilities.isEventDispatchThread()) {
            return textField.getText();
        } else {
            final String[] s = new String[1];
            try {
                SwingUtilities.invokeAndWait(new Runnable() {
                    @Override
                    public void run() {
                        s[0] = textField.getText();
                    }
                });
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
            return s[0];
        }
    }
}
