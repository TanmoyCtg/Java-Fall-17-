import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Physics extends JFrame{
	JLabel lblFirst,lblSecond;
	JButton btnConverter;
	JTextField txtFirst, txtSecond;
	
	public Physics(){
		addComponentsToFrame();
		converter();
	}
	public void addComponentsToFrame(){
		this.setSize(440,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Converter ");
		
		// create two level
		this.lblFirst 	= new JLabel("Celsius");
		this.lblSecond 	= new JLabel("Fahrenheit");
		
		// create two textField
		this.txtFirst 	= new JTextField();
		this.txtSecond 	= new JTextField();
		//create one button
		this.btnConverter = new JButton("converter");
		
		this.setLayout(null);
		
		this.lblFirst.setBounds(15, 5, 120, 20);
		this.txtFirst.setBounds(150, 5, 150, 20);
		
		this.lblSecond.setBounds(15, 35, 130, 20);
		this.txtSecond.setBounds(150, 35, 150, 20);
		
		this.btnConverter.setBounds(150, 95, 160, 40);
		
		
		this.add(this.lblFirst);
		this.add(this.lblSecond);
		this.add(this.txtFirst);
		this.add(this.txtSecond);
		this.add(this.btnConverter);
		
	}
	
private void CelsiusToFahrenheit () {
		String input;
		input = this.textFirst1.getText();
		int n1;
		n1 = Integer.valueOf(input);
		int formula_1 = (9*n1);
		int formula_11 = formula_1 / 5;
		int formula_111 = formula_11 + 32;
		System.out.println(formula_111);
	}
	
	private void FahreitToCelsius( ) {
		String input;
		input = this.textFirst1.getText();
		int n1;
		n1 = Integer.valueOf(input);
		int formula_1 = n1 - 32;
		int formula_11 = formula_1 * 5;
		int formula_111 = formula_11 / 32;
		System.out.println(formula_111);
		
	}
	private void converter(){
		CelsiusToFahrenheit();
		//FahreitToCelsius();
	}

}
