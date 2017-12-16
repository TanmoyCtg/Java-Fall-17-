import javax.swing.*;
import java.awt.*;

public class AdminCreateCourse extends JPanel{
	
	JButton btn2;
	
	public AdminCreateCourse(){
		this.setLayout(null);
		this.setBackground(new Color(125,25,125));
		addComponentToPanel();
	}
	
	public void addComponentToPanel(){
		this.btn2 = new JButton("Show info");
		this.btn2.setBounds(200, 250, 100, 30);
		this.add(btn2);
	}
}