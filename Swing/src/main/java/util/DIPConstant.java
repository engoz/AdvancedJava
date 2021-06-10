package util;

import javax.swing.*;
import java.awt.*;

/**
 * Created by servicium on 16.06.2016.
 */
public class DIPConstant {
    public static void setUITextFieldColor() {
        /*Set default settings for ComboBox.It changes the colors for textField -> enabled, disabled, font. **/

        UIManager.put("TextField.background", Colors.DARK_BACKCOLOR);
        UIManager.put("TextField.foreground", Colors.FOREGROUND);
        UIManager.put("TextField.inactiveBackground", Colors.DARK_BACKCOLOR);
        UIManager.put("TextField.inactiveForeground", Colors.FOREGROUND);
        UIManager.put("TextField.font", new Font(Font.SANS_SERIF, Font.PLAIN, 18));
    }

    public static void setUneditableUIComboBoxColor() {
        /*Set default settings for ComboBox. It changes the colors for items in comboBoxList -> enabled, disabled, hover */
        UIManager.put("ComboBox.background", Colors.DARK_BACKCOLOR);
        UIManager.put("ComboBox.foreground", Colors.FOREGROUND);
        UIManager.put("ComboBox.disabledBackground", Colors.DARK_BACKCOLOR);
        UIManager.put("ComboBox.disabledForeground", Colors.FOREGROUND);
        UIManager.put("ComboBox.selectionBackground", Colors.LINE_BACKCOLOR);
        UIManager.put("ComboBox.selectionForeground", Colors.FOREGROUND);
    }

    public static void setEditableUIComboBoxColor() {
        /*Set default settings for ComboBox. It changes the colors for items in comboBoxList -> enabled, disabled, hover */
        UIManager.put("ComboBox.background", Colors.DARK_BACKCOLOR);
        UIManager.put("ComboBox.foreground", Colors.FOREGROUND);
        UIManager.put("ComboBox.disabledBackground", Colors.BACKCOLOR);
        UIManager.put("ComboBox.disabledForeground", Colors.FOREGROUND);
        UIManager.put("ComboBox.selectionBackground", Colors.LINE_BACKCOLOR);
        UIManager.put("ComboBox.selectionForeground", Colors.FOREGROUND);
        UIManager.put("ComboBox.selectionForeground", Colors.FOREGROUND);
        UIManager.put("ComboBox.buttonBackground", Colors.DARK_BACKCOLOR);
    }

    private static void setSpinnerUIColor() {
        UIManager.put("Spinner.background", Colors.DARK_BACKCOLOR);
        UIManager.put("Spinner.foreground", Colors.FOREGROUND);
    }

    public static final class Images {
        public static ImageIcon getImageIcon(String name) {
            return getImageIcon(name, ImageType.NORMAL);
        }


        public static ImageIcon getImageIcon(String name, ImageType type) {
            ImageIcon icon = null;
            try {
                icon = new ImageIcon(Images.class.getResource("/images/" + name + type.getPostfix() + ".png"));
            } catch (Exception ignore) {
            }
            return icon;
        }


        public enum ImageType {
            NORMAL(""),
            HOVER("-H"),
            CLICKED("-C"),
            DISABLED("-D"),
            SELECTED("-S");

            private final String postfix;

            ImageType(String postfix) {
                this.postfix = postfix;
            }

            private String getPostfix() {
                return postfix;
            }

        }
    }

    public static final class Colors {
        public static final Color PANEL_BACKCOLOR = Color.decode("#202229");
        public static final Color TOOLBAR_BACKCOLOR = Color.decode("#1c1e23");
        public static final Color DARK_BACKCOLOR = Color.decode("#202229");
        public static final Color THUMB_COLOR = Color.decode("#262930");
        public static final Color COMBO_CELL_HOVER = Color.decode("#262930");
        public static final Color TRACK_COLOR = Color.decode("#20242a");
        public static final Color BACKCOLOR = Color.decode("#2e3138");
        public static final Color LINE_BACKCOLOR = Color.decode("#414042");
        public static final Color FOREGROUND = Color.decode("#b5b5b5");
        public static final Color PRICE_PANEL_BACKCOLOR = Color.decode("#A1D0D8");
        public static final Color PRICE_PANEL_BOTTOM_COLOR = Color.decode("#bef5ff");
        public static final Color SPREAD_COLOR = Color.decode("#00aedb");
        public static final Color FREEDAY_COLOR = Color.decode("#db4426");
        public static final Color TEXT_COLOR = Color.decode("#b5b5b5");
        public static final Color TEXT_COLOR_BLACK = Color.decode("#202229");
        public static final Color TEXT_COLOR_LIGHTBLACK = Color.decode("#414553");
        public static final Color TABLE_CELL_COLOR = Color.decode("#1d2026");
        public static final Color TABLE_LABEL_COLOR = Color.decode("#22252c");

        public static final Color WHITE = Color.decode("#ffffff");
        public static final Color RED = Color.decode("#db4426");
        public static final Color BLUE = Color.decode("#00aedb");
        public static final Color COMBOBOX_BORDER = Color.decode("#1b1b22");

    }

    public static final class SmallWindow {
        //DIPPanel
        public static final Dimension SIZE = new Dimension(262, 292);


        //ToolBar
        public static final Dimension TOOL_BAR_SIZE = new Dimension(262, 51);
        public static final Dimension TOOL_BAR_BUTTON_SIZE = new Dimension(13, 13);
        public static final Dimension TOOL_BAR_COMBOBOX_SIZE = new Dimension(110, 27);
        public static final int TOOL_BAR_BUTTON_WIDTH_GAB = 8;
        public static final int TOOL_BAR_RIGHT_PADDING = 10;
        public static final int TOOL_BAR_LEFT_PADDING = 10;
        public static final int TOOL_BAR_TOP_PADDING = 12;
        public static final int TOOL_BAR_BOTTOM_PADDING = 12;

        //PricePanel
        public static final Dimension PRICE_PANEL_SIZE = new Dimension(122, 106);
        public static final Dimension PRICE_PANEL_SIZE_NEON = new Dimension(122, 106);
        public static final Dimension PRICE_PANEL_COMBOBOX = new Dimension(30, 15);


        //PricePanel
        public static final Dimension DIP_PRICE_PANEL_SIZE = new Dimension(262, 120);


        //MaxPosition Amount Panel
        public static final Dimension MAX_POS_AMOUNT_PANEL_SIZE = new Dimension(262, 20);
        public static final Dimension MAX_POS_AMOUNT_BUTTON_SIZE = new Dimension(19, 20);

        //Slider Panel
        public static final Dimension SLIDER_PANEL_SIZE = new Dimension(262, 35);
        public static final Dimension SLIDER_BUTTON_SIZE = new Dimension(13, 13);

        //Button Bar
        public static final Dimension BUTTON_BAR_PANEL_SIZE = new Dimension(246, 48);
        public static final Dimension BUTTOM_BAR_BUTTON_SIZE = new Dimension(30, 29);
        public static final int BUTTOM_BAR_BUTTON_SLUT = 2;
        public static final int BUTTOM_BAR_VGAP = 17;
        public static final Dimension BUTTON_BAR_LINE = new Dimension(23, 1);


        //Bottom Panel
        public static final Dimension BOTTOM_PANEL_SIZE = new Dimension(262, 38);


        //LadderPanel
        public static final Dimension LADDER_PANEL_BUTTON = new Dimension(120, 20); //120
        public static final int LADDER_PANEL_WIDTH = 262;
        public static final int LADDER_PANEL_TABLE_WIDTH = 240;
        public static final int LADDER_PANEL_TABLE_COLUMN_0_WITHOUT_BUTTON_WIDTH = 58; //55
        public static final int LADDER_PANEL_TABLE_COLUMN_0_WITH_BUTTON_WIDTH = 73; //70 .
        public static final int LADDER_PANEL_TABLE_COLUMN_1_WITHOUT_BUTTON_WIDTH = 45; //56
        public static final int LADDER_PANEL_TABLE_COLUMN_1_WITH_BUTTON_WIDTH = 30; //37
        public static final int LADDER_PANEL_TABLE_COLUMN_N_WIDTH = 70; //85
        public static final int LADDER_PANEL_TABLE_ROW_HEIGHT = 34; //+ 1 space

        //Fonts
        public static final Font EXTRA_LARGE = new Font("Arial", Font.BOLD, 42);
        public static final Font LARGE_MEDIUM = new Font("Arial", Font.PLAIN, 22);
        public static final Font LARGE = new Font("Arial", Font.PLAIN, 18);
        public static final Font MEDIUM_BOLD = new Font("Arial", Font.BOLD, 15);
        public static final Font MEDIUM = new Font("Arial", Font.PLAIN, 13);
        public static final Font MEDIUM_HOVER = new Font("Arial", Font.BOLD, 13);
        public static final Color MEDIUM_HOVER_COLOR = Color.decode("#ffffff");
        public static final Font SMALL = new Font("Arial", Font.PLAIN, 12);
        public static final Font XSMALL = new Font("Arial", Font.PLAIN, 11);
        public static final Font XSMALL_BOLD = new Font("Arial", Font.BOLD, 11);
        public static final Font XSMALL_HOVER = new Font("Arial", Font.PLAIN, 11);
        public static final Color XSMALL_HOVER_COLOR = Color.decode("#00aedb");


    }

    public static final class LargeWindow {

        //DIPPanel
        public static final Dimension SIZE = new Dimension(328, 364);

        //ToolBar
        public static final Dimension TOOL_BAR_SIZE = new Dimension(328, 64);
        public static final Dimension TOOL_BAR_BUTTON_SIZE = new Dimension(16, 16);
        public static final Dimension TOOL_BAR_COMBOBOX_SIZE = new Dimension(133, 33);
        public static final int TOOL_BAR_BUTTON_WIDTH_GAB = 10;
        public static final int TOOL_BAR_RIGHT_PADDING = 12;
        public static final int TOOL_BAR_LEFT_PADDING = 12;
        public static final int TOOL_BAR_TOP_PADDING = 23;
        public static final int TOOL_BAR_BOTTOM_PADDING = 24;


        //PricePanel
        public static final Dimension PRICE_PANEL_SIZE = new Dimension(148, 109);
        public static final Dimension PRICE_PANEL_SIZE_NEON = new Dimension(152, 129);
        public static final Dimension PRICE_PANEL_COMBOBOX = new Dimension(37, 19);


        //DoublePricePanel
        public static final Dimension DIP_PRICE_PANEL_SIZE = new Dimension(328, 150);

        //MaxPosition Amount Panel
        public static final Dimension MAX_POS_AMOUNT_PANEL_SIZE = new Dimension(328, 22);
        public static final Dimension MAX_POS_AMOUNT_BUTTON_SIZE = new Dimension(24, 22);


        //Slider Panel
        public static final Dimension SLIDER_PANEL_SIZE = new Dimension(328, 45);
        public static final Dimension SLIDER_BUTTON_SIZE = new Dimension(16, 16);


        //Button Bar
        public static final Dimension BUTTON_BAR_PANEL_SIZE = new Dimension(304, 58);
        public static final Dimension BUTTOM_BAR_BUTTON_SIZE = new Dimension(37, 36);
        public static final int BUTTOM_BAR_BUTTON_STRUT = 4;
        public static final int BUTTOM_BAR_VGAP = 10;
        public static final Dimension BUTTON_BAR_LINE = new Dimension(44, 1);

        public static final Dimension BOTTOM_PANEL_SIZE = new Dimension(328, 47);


        //LadderPanel
        public static final Dimension LADDER_PANEL_BUTTON = new Dimension(151, 25); //151, 25
        public static final int LADDER_PANEL_WIDTH = 328;
        public static final int LADDER_PANEL_TABLE_WIDTH = 308;
        public static final int LADDER_PANEL_TABLE_COLUMN_0_WITHOUT_BUTTON_WIDTH = 68; //68
        public static final int LADDER_PANEL_TABLE_COLUMN_0_WITH_BUTTON_WIDTH = 87; //87 .
        public static final int LADDER_PANEL_TABLE_COLUMN_1_WITHOUT_BUTTON_WIDTH = 56; //56
        public static final int LADDER_PANEL_TABLE_COLUMN_1_WITH_BUTTON_WIDTH = 37; //37
        public static final int LADDER_PANEL_TABLE_COLUMN_N_WIDTH = 85; //85
        public static final int LADDER_PANEL_TABLE_ROW_HEIGHT = 41;

        //Fonts
        public static final Font EXTRA_LARGE = new Font("Arial", Font.BOLD, 52);
        public static final Font LARGE = new Font("Arial", Font.PLAIN, 23);
        public static final Font MEDIUM_BOLD = new Font("Arial", Font.BOLD, 19);
        public static final Font MEDIUM = new Font("Arial", Font.PLAIN, 19);
        public static final Font SMALL = new Font("Arial", Font.PLAIN, 15);
        public static final Font SMALL_BOLD = new Font("Arial", Font.BOLD, 15);
        public static final Font XSMALL = new Font("Arial", Font.PLAIN, 14);
        public static final Font XSMALL_BOLD = new Font("Arial", Font.BOLD, 14);
        public static final Font XSMALL_HOVER = new Font("Arial", Font.PLAIN, 14);
        public static final Color XSMALL_HOVER_COLOR = Color.decode("#00aedb");


    }

    public static final class Components {
        //Buttons


        //ToolBar Buttons
        public static final String SETTINGS_NORMAL = "BTN.Settings-NORMAL.png";
        public static final String SETTINGS_HOVER = "BTN.Settings-HOVER.png";
        public static final String SETTINGS_CLICK = "BTN.Settings-CLICK.png";
        public static final String LOCK_NORMAL = "Lock.png";
        public static final String LOCK_HOVER = "Lock-H.png";
        public static final String LOCK_CLICK = "Lock-C.png";
        public static final String UNLOCK_NORMAL = "UnLock.png";
        public static final String UNLOCK_HOVER = "UnLock-H.png";
        public static final String UNLOCK_CLICK = "UnLock-C.png";
        public static final String DOCK_NORMAL = "BTN.Dock-NORMAL.png";
        public static final String DOCK_HOVER = "BTN.Dock-HOVER.png";
        public static final String DOCK_CLICK = "BTN.Dock-CLICK.png";
        public static final String CLOSE_NORMAL = "Close.png";
        public static final String CLOSE_HOVER = "Close-H.png";
        public static final String CLOSE_CLICK = "Close-C.png";


        //ButtonBar Buttons

        public static final String ACCOUNT_NORMAL = "BTN.Hesap-NORMAL.png";
        public static final String ACCOUNT_HOVER = "BTN.Hesap-HOVER.png";
        public static final String ACCOUNT_CLICK = "BTN.Hesap-CLICK.png";
        public static final String CHART_NORMAL = "BTN.Grafik-NORMAL.png";
        public static final String CHART_HOVER = "BTN.Grafik-HOVER.png";
        public static final String CHART_CLICK = "BTN.Grafik-CLICK.png";
        public static final String NEO40_NORMAL = "BTN.Neo40-NORMAL.png";
        public static final String NEO40_HOVER = "BTN.Neo40-HOVER.png";
        public static final String NEO40_CLICK = "BTN.Neo40-CLICK.png";
        public static final String ORDER_NORMAL = "BTN.EmirGiris-NORMAL.png";
        public static final String ORDER_HOVER = "BTN.EmirGiris-HOVER.png";
        public static final String ORDER_CLICK = "BTN.EmirGiris-CLICK.png";


        //Max Amount Buttons
        public static final String MAX_POS_AMOUNT_NORMAL = "BTN.100M-NORMAL.png";
        public static final String MAX_POS_AMOUNT_HOVER = "BTN.100M-HOVER.png";
        public static final String MAX_POS_AMOUNT_CLICK = "BTN.100M-CLICK.png";


        //Slider
        public static final String SLIDER_ARROW_GREEN = "SLIDER_ARROW_GREEN.png";
        public static final String SLIDER_ARROW_RED = "SLIDER_ARROW_RED.png";


        //Price Panel BackGround Image
        public static final String PRICE_PANEL_ACTIE_BACKGROUND = "PRICE-PANEL-BACKGROUND.png";
        public static final String PRICE_PANEL_LOCKED_BACKGROUD = "PRICE-PANEL-LOCKED-BACKGROUND.png";
        public static final String PRICE_PANEL_PASSIVE_BACKGROUND = "PRICE-PANEL-PASSIVE-BACKGROUND.png";
        public static final String PRICE_PANEL_GREEN_NEON = "PRICE-PANEL-GREEN-NEON.png";
        public static final String PRICE_PANEL_RED_NEON = "PRICE-PANEL-RED-NEON.png";

        public static final String PRICE_PANEL_SPREAD = "Spread.png";


        //BottomPanel Buttom
        public static final String CALENDAR_BUTTON = "CALENDAR-BUTTON.png";
        public static final String CALENDAR_INPUT_CLICK = "Calendar-Input-Click.png";
        public static final String CALENDAR_INPUT_NORMAL = "Calendar-Input-Normal.png";
        public static final String CALENDAR_INPUT_DISABLED = "Calendar-Input-Disabled.png";


        //LadderPanel Buttons
        public static final String LADDER_CALENDAR_BTN_NORMAL = "Btn-Normal.png";
        public static final String LADDER_CALENDAR_BTN_HOVER = "Btn-Hover.png";
        public static final String LADDER_CALENDAR_BTN_CLICK = "Btn-Click.png";
        public static final String LADDER_TEXTFIELD_CLICK = "Input-Click.png";
        public static final String LADDER_TEXTFIELD_NORMAL = "Input-Normal.png";

        public static final String LADDER_HOVER = "Ladder-H.png";
        public static final String LADDER_NORMA = "Ladder.png";
        public static final String LADDER_CLICK = "Ladder-C.png";

        public static final String LEFT_SCOPE = "LeftScope.png";
        public static final String LEFT_SCOPE_HOVER = "LeftScope-H.png";
        public static final String LEFT_SCOPE_SELECTED = "LeftScope-S.png";
        public static final String LEFT_SCOPE_RIGHT_HOVER = "LeftScopeRightHover.png";


        public static final String RIGHT_SCOPE = "RightScope.png";
        public static final String RIGHT_SCOPE_HOVER = "RightScope-H.png";
        public static final String RIGHT_SCOPE_SELECTED = "RightScope-S.png";
        public static final String RIGHT_SCOPE_LEFT_HOVER = "RightScopeLeftHover.png";

        //ALL Drop Downs

        public static final String DROPDOWN_TRACKER_DOWN = "DropDown-Tracker-DOWN.png";
        public static final String DROPDOWN_TRACKER_UP = "DropDown-Tracker-UP.png";

        public static final String DROPDOWN_TRACKER_LEFT = "DropDown-Tracker-Left.png";
        public static final String DROPDOWN_TRACKER_RIGHT = "DropDown-Tracker-Right.png";

        //Symbol ComboBox
        public static final String SYMBOL_COMBO_ARROW_DISABLED = "SYMBOL.DropDown-DISABLED.png";
        public static final String SYMBOL_COMBO_ARROW_NORMAL = "SYMBOL.DropDown-NORMAL.png";
        public static final String SYMBOL_COMBO_ARROW_HOVER = "SYMBOL.DropDown-HOVER.png";
        public static final String SYMBOL_COMBO_ARROW_CLICK = "SYMBOL.DropDown-CLICK.png";
        public static final String SYMBOL_INPUT_CLICK = "SYMBOL.DropDown-INPUT-CLICK.png";
        public static final String SYMBOL_INPUT_NORMAL = "SYMBOL.DropDown-INPUT-NORMAL.png";
        public static final String SYMBOL_INPUT_DARK = "SYMBOL.DropDown-INPUT-DARK.png";
        public static final String SYMBOL_INPUT_CLICK_W120 = "SYMBOL.DropDown-INPUT-CLICK_W120.png";
        public static final String SYMBOL_INPUT_NORMAL_W120 = "SYMBOL.DropDown-INPUT-NORMAL_W120.png";
        public static final String SYMBOL_INPUT_DARK_W120 = "SYMBOL.DropDown-INPUT-DARK_W120.png";
        public static final String SYMBOL_COMBO_ARROW_DARK = "SYMBOL.DropDown-DARK.png";
        public static final String CALENDAR_COMBO_ARROW_DARK = "CALENDAR-COMBO-ARROW-DARK.png";
        public static final String SYMBOL_DROPDOWN_120 = "dropdown_120w.png";
        public static final String SYMBOL_TEXTFIELD_140 = "input-normal-140.png";
        public static final String SYMBOL_TEXTFIELD_CLICK_140 = "input-clicked-140.png";
        public static final String SYMBOL_TEXTFIELD_30 = "input-normal-30.png";
        public static final String SYMBOL_TEXTFIELD_CLICK_30 = "input-clicked-30.png";

        //QuicOrders ComboBox
        public static final String QUICKORDER_ARROW_HOVER = "QUICKORDER.DropDown-HOVER.png";
        public static final String QUICKORDER_ARROW_NORMAL = "QUICKORDER.DropDown-NORMAL.png";
        public static final String QUICKORDER_TEXT_AREA = "QUICKORDER.DropDown-TEXTBACK.png";


        public static final String AMOUNT_COMBO_ARROW_DISABLED = "AMOUNT.DropDown-DISABLED.png";
        public static final String AMOUNT_COMBO_ARROW_NORMAL = "AMOUNT.DropDown-NORMAL.png";
        public static final String AMOUNT_COMBO_ARROW_HOVER = "AMOUNT.DropDown-HOVER.png";
        public static final String AMOUNT_INPUT_CLICK = "AMOUNT.DropDown-INPUT-CLICK.png";
        public static final String AMOUNT_INPUT_NORMAL = "AMOUNT.DropDown-INPUT-NORMAL.png";

        //TMU
        public static final String CUSTOMER_FILTER_INPUT_NORMAL = "CustomerFilter.png";
        public static final String CUSTOMER_FILTER_INPUT_CLICKED = "CustomerFilter-C.png";

    }
}
