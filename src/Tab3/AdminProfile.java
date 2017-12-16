import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;


public class AdminProfile extends JPanel{
	
	JButton btn1;
	MyFrame frame;
	
	public AdminProfile(){
		
	}
	
	public AdminProfile(MyFrame frame){
		this.frame = frame;
		this.setLayout(null);
		this.setBackground(new Color(55,55,25));
		addComponentToPanel();
	}
	
	public void addComponentToPanel(){
		this.btn1 = new JButton("Click!");
		this.btn1.setBounds(200, 250, 100, 30);
		this.add(btn1);
		
		AdminListener aLis = new AdminListener(frame);
		this.btn1.addActionListener(aLis);
	}
	
	/* //Inner Class
	class AdminListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			frame.dispose();
			
			JFrame frame2 = new JFrame();
			frame2.setTitle("Student Deshbord");
			frame2.setSize(600, 800);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.setVisible(true);
			//System.exit(0);
		}
	} */
}