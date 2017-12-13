import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame {
    private JButton textButton,textButton2;

    public Button(){
        //window title
        super("MERA BUTTAL");
        // layout set
        setLayout(new FlowLayout());
        // button name
        textButton = new JButton("Click ME!");
        //textButton2 = new JButton("HI");
        add(textButton);

        ButtonHandler handler = new ButtonHandler();
        textButton.addActionListener(handler);

    }

    private class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog
                    (Button.this,String.format(event.getActionCommand()));
        }
    }

}
