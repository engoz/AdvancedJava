package lists.panels;

import javax.swing.*;
import java.awt.*;

/**
 * Created by servicium on 03.11.2016.
 */
public class Test extends JFrame {

    private JList menuList;
    private JScrollPane menuScrollPane;
    private JSplitPane splitPane;
    private JPanel contentPanel;

    public Test() {

        contentPanel = new JPanel();

        // construct the menuList as a JList
        menuList = new JList();
        menuList.setCellRenderer(new ImageListCellRenderer());

// get our images
        Icon pingImage = new ImageIcon(getClass().getResource("/images/Flags/ca.png"));
        Icon tracerouteImage = new ImageIcon(getClass().getResource("/images/Flags/de.png"));
        Icon netstatImage = new ImageIcon(getClass().getResource("/images/Flags/fr.png"));

// add the images to jlabels with text
        JLabel pingLabel = new JLabel("Ping", pingImage, JLabel.LEFT);
        JLabel tracerouteLabel = new JLabel("Traceroute", tracerouteImage, JLabel.LEFT);
        JLabel netstatLabel = new JLabel("Netstat", netstatImage, JLabel.LEFT);

// create the corresponding panels
        JPanel pingPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel traceroutePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel netstatPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

// add the labels onto the panels
        pingPanel.add(pingLabel);
        traceroutePanel.add(tracerouteLabel);
        netstatPanel.add(netstatLabel);

// create a panel array
        Object[] panels = {pingPanel, traceroutePanel, netstatPanel};

// tell the jlist to use the panel array for its data
        menuList.setListData(panels);

        menuList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        menuList.setLayoutOrientation(JList.VERTICAL);
        menuList.setFixedCellHeight(46);

// put our JList in a JScrollPane
        menuScrollPane = new JScrollPane(menuList);
        menuScrollPane.setMinimumSize(new Dimension(150, 50));

// put our JList and JScrollPane in the left hand side of a JSplitPane
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                menuScrollPane,
                contentPanel);

        add(splitPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JList Renderer Example");
        this.setSize(200, 200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Test();
        });
    }
}
