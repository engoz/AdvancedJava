package tab;

/**
 * Created by servicium on 16.06.2016.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mains extends JFrame {
    private JTabbedPane jtp = new JTabbedPane();
    //private Transpa                 tp[]        = new Transpa[5];
    private JTextPane tp[] = new JTextPane[5];
    private JTextPane textPane;

    private int i = 0;
    private int index = 0;

    public static void main(String[] argv) {
        Mains m = new Mains();
    }


    public Mains() {
        super("Editor Text Center");
        createDocument();


        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu file = new JMenu("File");
        JMenuItem newItemFile = new JMenuItem("New");
        newItemFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createDocument();
            }
        });
        JMenuItem ItemFile = new JMenuItem("test");
        ItemFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = jtp.getSelectedIndex();
                JTextPane jTPane = tp[index];
                System.out.println(jTPane.getText());

            }
        });
        file.add(newItemFile);
        file.add(ItemFile);
        menuBar.add(file);


        setSize(990, 735);
        pack();
        setVisible(true);
    }


    public void createDocument() {
        tp[i] = new JTextPane();

        JTextPane t = tp[i];
        t.setText("a" + (i + 1));
        JScrollPane editorScroll = new JScrollPane(tp[i]);
        jtp.add("doc" + (i + 1), editorScroll);
        getContentPane().add(jtp, BorderLayout.CENTER);
        i++;
    }
}
