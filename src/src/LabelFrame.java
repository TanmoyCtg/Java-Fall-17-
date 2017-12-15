import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class LabelFrame extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public LabelFrame() {
        // we need to add JLabel to JFrame
        super("Testing Label");
        setLayout(new FlowLayout());

        //label1 = new JLabel("Label with text");
        //label1.setToolTipText("This is label1");
        //add(label1);

        // how to load image with string
//        ImageIcon icon = createImageIcon("Mango-icon.png", "Mango");
//        label2 = new JLabel("Image and text", icon, JLabel.CENTER);
    }

//    protected ImageIcon createImageIcon(String path, String description) {
//        URL url = getClass().getResource(path);
//        if (url != null) {
//            return new ImageIcon(url, description);
//        } else {
//            System.out.println("Couldn't find file: " + path);
//            return null;
//        }
//    }


}

