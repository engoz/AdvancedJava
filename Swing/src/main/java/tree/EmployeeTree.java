package tree;

/**
 * Created by servicium on 14.07.2016.
 */

import java.awt.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.plaf.IconUIResource;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;

class TreeNodeVectorA<E> extends Vector<E> {

    private static final long serialVersionUID = 1L;
    private String name;

    TreeNodeVectorA(String name) {
        this.name = name;
    }

    TreeNodeVectorA(String name, E elements[]) {
        this.name = name;
        for (int i = 0, n = elements.length; i < n; i++) {
            add(elements[i]);
        }
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }
}

class Employee {

    public String firstName;
    public String lastName;
    public float salary;

    Employee(String f, String l, float s) {
        this.firstName = f;
        this.lastName = l;
        this.salary = s;
    }
}

class EmployeeCellRenderer implements TreeCellRenderer {

    private JLabel firstNameLabel = new JLabel(" ");
    private JLabel lastNameLabel = new JLabel(" ");
    private JLabel salaryLabel = new JLabel(" ");
    private JPanel renderer = new JPanel();
    private DefaultTreeCellRenderer defaultRenderer = new DefaultTreeCellRenderer();
    private Color backgroundSelectionColor;
    private Color backgroundNonSelectionColor;

    EmployeeCellRenderer() {
        firstNameLabel.setForeground(Color.BLUE);
        renderer.add(firstNameLabel);
        lastNameLabel.setForeground(Color.BLUE);
        renderer.add(lastNameLabel);
        salaryLabel.setHorizontalAlignment(JLabel.RIGHT);
        salaryLabel.setForeground(Color.RED);
        renderer.add(salaryLabel);
        renderer.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        backgroundSelectionColor = defaultRenderer.getBackgroundSelectionColor();
        backgroundNonSelectionColor = defaultRenderer.getBackgroundNonSelectionColor();
    }


    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        Component returnValue = null;
        if ((value != null) && (value instanceof DefaultMutableTreeNode)) {
            Object userObject = ((DefaultMutableTreeNode) value).getUserObject();
            if (userObject instanceof Employee) {
                Employee e = (Employee) userObject;
                firstNameLabel.setText(e.firstName);
                lastNameLabel.setText(e.lastName);
                salaryLabel.setText("" + e.salary);
                if (selected) {
                    renderer.setBackground(backgroundSelectionColor);
                } else {
                    renderer.setBackground(backgroundNonSelectionColor);
                }
                renderer.setEnabled(tree.isEnabled());
                returnValue = renderer;
            }
        }
        if (returnValue == null) {
            returnValue = defaultRenderer.getTreeCellRendererComponent(tree, value, selected, expanded,
                    leaf, row, hasFocus);
        }
        return returnValue;
    }
}

class NodeIcon implements Icon {

    private static final int SIZE = 12;

    private char type;

    public NodeIcon(char type) {
        this.type = type;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(UIManager.getColor("Tree.background"));
        g.fillRect(x, y, SIZE - 1, SIZE - 1);

        g.setColor(UIManager.getColor("Tree.hash").darker());
        g.drawRect(x, y, SIZE - 1, SIZE - 1);

        g.setColor(UIManager.getColor("Tree.foreground"));
        g.drawLine(x + 2, y + SIZE / 2, x + SIZE - 3, y + SIZE / 2);
        if (type == '+') {
            g.drawLine(x + SIZE / 2, y + 2, x + SIZE / 2, y + SIZE - 3);
        }
    }

    public int getIconWidth() {
        return SIZE;
    }

    public int getIconHeight() {
        return SIZE;
    }
}

public class EmployeeTree {

    public static void main(String args[]) {
        UIManager.put("Tree.collapsedIcon", new IconUIResource(new NodeIcon('+')));
        UIManager.put("Tree.expandedIcon", new IconUIResource(new NodeIcon('-')));
        JFrame frame = new JFrame("Book Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Employee javaBooks[] = {new Employee("A", "F", 9.99f), new Employee("B", "E", 4.99f),
                new Employee("C", "D", 9.95f)};
        Employee netBooks[] = {new Employee("AA", "CC", 9.99f), new Employee("BB", "DD", 9.99f)};
        Vector<Employee> javaVector = new TreeNodeVectorA<Employee>("A", javaBooks);
        Vector<Employee> netVector = new TreeNodeVectorA<Employee>("As", netBooks);
        Object rootNodes[] = {javaVector, netVector};
        Vector<Object> rootVector = new TreeNodeVectorA<Object>("Root", rootNodes);
        JTree tree = new JTree(rootVector);
        TreeCellRenderer renderer = new EmployeeCellRenderer();
        tree.setCellRenderer(renderer);
        JScrollPane scrollPane = new JScrollPane(tree);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    private EmployeeTree() {
    }
}


