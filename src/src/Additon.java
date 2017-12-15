
import javax.swing.*;
import java.awt.*;

public class Additon{
    public static void main(String[] args){
            //Additon a1 =new Additon();


        String firstNumber = JOptionPane.showInputDialog("Enter first integer: ");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer: ");

        // converts string to int values
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;
        JOptionPane.showMessageDialog(null,"The sum is "+sum);
//        a1.setSize(400,300);
//        a1.setVisible(true);



    }
}
