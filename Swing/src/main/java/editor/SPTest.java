package editor;

/**
 * Created by enginoz on 10/03/17.
 */

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;


public class SPTest extends JFrame {

    private static final long serialVersionUID = 1L;

    private JEditorPane editor;
    private JScrollPane scrollPane;
    private JPanel topPanel;
    private JLabel labelTop;

    public SPTest() {
        super("Editor test");
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents() {
        editor = new JEditorPane("text/plain", null);
        scrollPane = new JScrollPane(editor);
        topPanel = new JPanel();
        labelTop = new JLabel("main contents here");
        topPanel.add(labelTop);

        setSize(600, 400);
        editor.setMinimumSize(new Dimension(100, 30));
        editor.setPreferredSize(new Dimension(100, 60));
        scrollPane.setPreferredSize(new Dimension(600, 60));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setMinimumSize(new Dimension(100, 30));

        final int MAX_HEIGHT_RSZ = 120;
        editor.addCaretListener(new CaretListener() {

            public void caretUpdate(CaretEvent e) {
                int height = Math.min(editor.getPreferredSize().height, MAX_HEIGHT_RSZ);
                Dimension preferredSize = scrollPane.getPreferredSize();
                preferredSize.height = height;
                scrollPane.setPreferredSize(preferredSize);
                SPTest.this.validate();
            }
        });

        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new SPTest();
    }

}
