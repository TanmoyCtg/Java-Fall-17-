import javax.swing.*;
import java.awt.Color;

public class MenuFrame extends JFrame{
    private final Color colorValues[] ={Color.BLACK,Color.BLUE,Color.RED,Color.GREEN};
    private int style;
    private JLabel displayJLabel;
    private ButtonGroup fontButtonGroup; // manages font menu items
    private ButtonGroup colorButtonGroup; // manages color menu items
    private JRadioButtonMenuItem fonts[]; // font menu items
    private JRadioButtonMenuItem styleItems[]; // font style menu items
}
