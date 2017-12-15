import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    private JButton plainButton,plainButton1; // Button with text

    public ButtonFrame(){
        super("Testing Button");
        setLayout(new FlowLayout()); // set frame layout
        plainButton = new JButton("Plain Button"); // button with text
        add(plainButton);

        plainButton1 = new JButton("Another Button");
        add(plainButton1);

        // Create new ButtonHandler class to handle button handling
        ButtonHandler handler = new ButtonHandler();
        plainButton.addActionListener(handler);
        plainButton1.addActionListener(handler);

    }
    // button event handling
    private class ButtonHandler implements ActionListener{
        // handle button event
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog
                    (ButtonFrame.this,String.format("you pressed: %s",event.getActionCommand()));
        }
    }

}
