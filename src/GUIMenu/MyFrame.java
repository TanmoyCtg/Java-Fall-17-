import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	
	JLabel lblFirst, lblSecond, lblResult;
	JTextField txtFirst, txtSecond, txtResult;
	JButton btnSum;
	
	JMenuBar bar;
	JMenu menuFile;
	JMenu menuHelp;
	JMenu menuNew;
	JMenuItem menuItemText,menuItemDoc,menuItemVersion,menuItemExit,menuItemFaq;
	
	JTextField defaultFocusWorkaround;
	
	public MyFrame() {
		this.setSize(370, 200); 
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Simple Calculator");
	}
	
	public void addComponentsToFrame()
	{
		this.lblFirst 	= new JLabel("Enter First Number:");
		this.lblSecond 	= new JLabel("Enter Second Number:");
		this.lblResult 	= new JLabel("Result:");
		
		this.txtFirst 	= new JTextField();
		this.txtSecond 	= new JTextField();
		this.txtResult 	= new JTextField();
		
		this.btnSum = new JButton("SUM");
		
		this.bar 		= new JMenuBar();
		this.menuFile 	= new JMenu("File");
		this.menuHelp 	= new JMenu("Help");
		this.menuNew 	= new JMenu("New");
		
		this.menuItemText 		= new JMenuItem("Text");
		this.menuItemDoc 		= new JMenuItem("Doc");
		this.menuItemExit 		= new JMenuItem("Exit");
		this.menuItemVersion 	= new JMenuItem("Version");
		this.menuItemFaq 		= new JMenuItem("FAQ");
		
		this.setLayout(null);
		
		this.lblFirst.setBounds(15, 5, 120, 20);
		this.txtFirst.setBounds(150, 5, 150, 20);
		
		this.lblSecond.setBounds(15, 35, 130, 20);
		this.txtSecond.setBounds(150, 35, 150, 20);
		
		this.lblResult.setBounds(15, 65, 120, 20);
		this.txtResult.setBounds(150, 65, 150, 20);
		
		this.btnSum.setBounds(150, 95, 60, 20);
		this.txtResult.setEditable(false);
		
		this.setJMenuBar(bar);
		this.bar.add(this.menuFile);
		this.bar.add(this.menuHelp);
		
		this.menuFile.add(this.menuNew);
		this.menuFile.add(this.menuItemExit);
		
		this.menuNew.add(this.menuItemText);
		this.menuNew.add(this.menuItemDoc);
		
		this.menuHelp.add(this.menuItemVersion);
		this.menuHelp.add(this.menuItemFaq);
		
		this.menuFile.setMnemonic('F');
		this.menuHelp.setMnemonic('H');
		
		this.add(this.lblFirst); 
		this.add(this.txtFirst);
		this.add(this.lblSecond); 
		this.add(this.txtSecond);
		this.add(this.lblResult); 
		this.add(this.txtResult);
		this.add(this.btnSum); 
		
		this.btnSum.setToolTipText("This is Sum button");
	}
	
	public void testAnnonymousClass()
	{
		this.txtFirst.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent e) {
				String s = txtFirst.getText();
				try{
					Integer.valueOf(s);
				}catch(Exception x)
				{
					txtFirst.setBackground(Color.yellow);
				}
			}
			
			public void focusGained(FocusEvent e) {
				txtFirst.setBackground(Color.WHITE);
			}
		});
		
		this.btnSum.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				sum();
			}
		});
		
		this.btnSum.addKeyListener(new KeyListener() {
		
			public void keyTyped(KeyEvent e) {
				
				System.out.println("keyTyped");
				sum();
				
			}

			public void keyReleased(KeyEvent e) {
				System.out.println("keyReleased");
			}
			
			public void keyPressed(KeyEvent e) {
				System.out.println("keyPressed");
				sum();				
			}
		});
		
		this.menuItemVersion.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane message=new JOptionPane("Version Box");
				message.showMessageDialog(null, "1.0");
					
			}
		});
		
		this.menuItemExit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
					
			}
		});
	}
	
	private void sum() {
		String s1 = this.txtFirst.getText();
		String s2 = this.txtSecond.getText();

		int n1, n2;
		n1 = Integer.valueOf(s1); 
		n2 = Integer.valueOf(s2);
		int sum = n1 + n2;
		String r = String.valueOf(sum);
		this.txtResult.setText(r);
	}

}







