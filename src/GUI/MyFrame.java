import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;

class MyFrame extends JFrame{
		
	public MyFrame(){
				
		this.setTitle("MyTitle");
		this.setSize(400,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flow = new FlowLayout();
		this.setLayout(flow);
		
		JButton btn = new JButton("Save");
		JLabel lbl = new JLabel("This is JLabel");
		JTextField tf = new JTextField(10);
		
 		this.add(btn);
		this.add(lbl);
		this.add(tf); 
		
	/*	JPanel panel = new JPanel();
	 	panel.add(btn);
		panel.add(lbl);
		panel.add(tf); 
		this.add(panel);*/
		
		//JOptionPane.showMessageDialog(null, "Test");
	}
}