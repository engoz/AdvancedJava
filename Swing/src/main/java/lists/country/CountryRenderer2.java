package lists.country;

/**
 * Created by servicium on 09.11.2016.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Custom renderer to display a country's flag alongside its name
 *
 * @author wwww.codejava.net
 */
public class CountryRenderer2 extends JPanel implements ListCellRenderer<Country> {

    public CountryRenderer2() {
        setOpaque(true);
    }

    public Component getListCellRendererComponent(JList<? extends Country> list, Country country, int index,
                                                  boolean isSelected, boolean cellHasFocus) {
        String code = country.getCode();
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/Flags/" + code + ".png"));
        JLabel label = new JLabel(imageIcon);
        JLabel label1 = new JLabel(country.getName());
        JButton button = new JButton("Test");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(country.getCode() + " - " + country.getName());
            }
        });
        this.setLayout(new FlowLayout());
        this.add(label);
        this.add(label1);
        this.add(button);
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        return this;
    }
}

