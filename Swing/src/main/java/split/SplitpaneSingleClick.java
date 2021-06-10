package split;

import javax.swing.*;

/**
 * Created by servicium on 02.08.2016.
 */
public class SplitpaneSingleClick {
    public static void main(String[] argv) throws Exception {
        JButton topComponent = new JButton("top");
        JButton bottomComponent = new JButton("bottom");
        JSplitPane vpane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topComponent, bottomComponent);
        boolean b = vpane.isOneTouchExpandable(); // false by default
        vpane.setOneTouchExpandable(true);
    }
}
