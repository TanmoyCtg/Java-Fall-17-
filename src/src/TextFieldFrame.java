import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldFrame extends JFrame {
    private JTextField textField1,textField2;
    private JLabel label1,label2;
    private JButton button,button1,button2,button3;

    public TextFieldFrame(){
        super("Testing JTextField");
        setLayout(new FlowLayout());
        label1 = new JLabel("Enter first number");
        add(label1);
        label2 = new JLabel("Enter second number");
        add(label2);
        textField1 = new JTextField(10); // this is box size mainly
        add(textField1);
        textField2 = new JTextField(10);
        add(textField2);
        button = new JButton("sum");
        add(button);
        button1 = new JButton("Substract");
        add(button1);
        button2 = new JButton("Multiply");
        add(button2);
        button3 = new JButton("Divide");
        add(button3);

        ButtonHanlder hanlder = new ButtonHanlder();
        ButtonHanlder1 hanlder1 = new ButtonHanlder1();
        ButtonHanlder2 handler2 = new ButtonHanlder2();
        ButtonHanlder3 handler3 = new ButtonHanlder3();
        button.addActionListener(hanlder);
        button1.addActionListener(hanlder1);
        button2.addActionListener(handler2);
        button3.addActionListener(handler3);
    }

    private class ButtonHanlder implements ActionListener{
        public void actionPerformed(ActionEvent event){
            //JOptionPane.showMessageDialog(TextFieldFrame.this,event.getActionCommand());
            sum();
        }
    }

    private class ButtonHanlder1 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            //JOptionPane.showMessageDialog(TextFieldFrame.this,event.getActionCommand());
            substract();

        }
    }


    private class ButtonHanlder2 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            //JOptionPane.showMessageDialog(TextFieldFrame.this,event.getActionCommand());
            multiply();
        }
    }

    private class ButtonHanlder3 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            //JOptionPane.showMessageDialog(TextFieldFrame.this,event.getActionCommand());
            Divided();
        }
    }


    private void sum(){
        String number1 = textField1.getText();
        String number2 = textField2.getText();

        int firstNumber = Integer.parseInt(number1);
        int secondNumber = Integer.parseInt(number2);

        int total = firstNumber + secondNumber;
        JOptionPane.showMessageDialog(null,"The sum is: "+total);
    }
    private void substract(){
        String number1 = textField1.getText();
        String number2 = textField2.getText();

        int firstNumber = Integer.parseInt(number1);
        int secondNumber = Integer.parseInt(number2);

        int total = firstNumber - secondNumber;
        JOptionPane.showMessageDialog(null,"The substract is "+total);
    }
    // multiply button mechanism
    private void multiply(){
        try{
        String number1 = textField1.getText();
        String number2 = textField2.getText();

        float firstNumber = Integer.parseInt(number1);
        float secondNumber = Integer.parseInt(number2);

        float total = firstNumber * secondNumber;
        JOptionPane.showMessageDialog(null,"The Multiply is "+total);
    }catch (NullPointerException x){System.out.println("error: "+x);}
    }
    // divided button formula
    private void Divided(){
        try {
        String number1 = textField1.getText();
        String number2 = textField2.getText();

        double firstNumber = Integer.parseInt(number1);
        double secondNumber = Integer.parseInt(number2);

        double total = firstNumber / secondNumber;
        JOptionPane.showMessageDialog(null,"The divided number is "+total);
    }catch(ArithmeticException e){
        System.out.println("sorry "+ e);

    }
    }
}
