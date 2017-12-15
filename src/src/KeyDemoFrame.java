import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
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

        add(textArea); // add textarea to JFrame

        addKeyListener(this); // allow frame to process key events
    }
    // handle press any key
    public void keyPressed(KeyEvent event){
        line1 = String.format("Key Pressed: %s",event.getKeyText(event.getKeyCode()));
        setLines2and3(event);
    }
    // handle release of any key
    public void keyReleased(KeyEvent event){
        line1=String.format("Key released: %s",event.getKeyText(event.getKeyCode()));
        setLines2and3(event);
    }
    // handle press of an action key
    public void keyTyped(KeyEvent event){
        line1 = String.format("Key typed: %s", event.getKeyChar());
        setLines2and3(event);
    }


    //set second and third lines of output
    private void setLines2and3(KeyEvent event){
        line2 = String.format("This key is %s an action key",(event.isActionKey()?"":"not " ));
        String temp = event.getKeyModifiersText(event.getModifiers());
        line3 = String.format("Modifiers keys pressed: %s",(temp.equals("")?"none":temp));
        textArea.setText(String.format("%s\n%s\n%s\n",line1,line2,line3 ));
    }

}
