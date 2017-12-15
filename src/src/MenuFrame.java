import javax.swing.*;
import java.awt.Color;
import java.lang.String;
import javax.swing.JMenuBar;

public class MenuFrame extends JFrame{
    private final Color colorValues[] ={Color.BLACK,Color.BLUE,Color.RED,Color.GREEN};
    private int style;
    private JLabel displayJLabel;
    private ButtonGroup fontButtonGroup; // manages font menu items
    private ButtonGroup colorButtonGroup; // manages color menu items
    private JRadioButtonMenuItem fonts[]; // font menu items
    private JRadioButtonMenuItem styleItems[]; // font style menu items
    private JRadioButtonMenuItem colorItems[]; // color menu items

    public MenuFrame(){
        super("Using JMenus");
        JMenu fileMenu = new JMenu("File"); // create file menu
        fileMenu.setMnemonic('F'); // remember single quotation
        add(fileMenu);

    }
    JMenuBar bar = new JMenuBar(); // create menu bar



}
