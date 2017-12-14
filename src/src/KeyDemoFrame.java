import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class KeyDemoFrame extends JFrame implements KeyListener{
    private String line1 = ""; // first line of textarea
    private String line2 = ""; // second line of textarea
    private String line3 =""; // third line of textarea
    private JTextArea textArea; // textarea to the display output

    public KeyDemoFrame(){
        super("Demonstrationg Keystroke events");

        textArea = new JTextArea(10,15);
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false ); // disable textarea
        textArea.setDisabledTextColor(Color.BLACK); // set text color

        
    }

}
