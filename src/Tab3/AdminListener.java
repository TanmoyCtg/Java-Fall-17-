import java.awt.event.*;
import javax.swing.*;

public class AdminListener implements ActionListener{
	
	MyFrame frame;
	
	public AdminListener(){
	}
	
	public AdminListener(MyFrame frame){
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e){
		this.frame.dispose();
		
		JFrame frame2 = new JFrame();
		frame2.setTitle("Student Deshbord");
		frame2.setSize(600, 500);
		frame2.setLocationRelativeTo(null);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
		//System.exit(0);
	}
}