import javax.swing.*;
import java.awt.*;

public class AdminAssignCourse extends JPanel{
	
	JButton btn3;
	
	public AdminAssignCourse(){
		this.setLayout(null);
		this.setBackground(new Color(155,55,25));
		addComponentToPanel();
	}
	
	public void addComponentToPanel(){
		this.btn3 = new JButton("Show info");
		this.btn3.setBounds(200, 250, 100, 30);
		this.add(btn3);
	}
}