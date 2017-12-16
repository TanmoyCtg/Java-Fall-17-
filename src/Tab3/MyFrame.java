import javax.swing.*;

public class MyFrame extends JFrame{
	
	AdminProfile 		aProfile;
	AdminCreateCourse 	aCreate;
	AdminAssignCourse 	aAssign;
	JTabbedPane			tab;
	
	public MyFrame(){
		this.setTitle("Admin Dashbord");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		
		addComponentToFrame();
		this.setVisible(true);
	}
	
	public void addComponentToFrame(){
		
		this.aProfile 	= new AdminProfile(this);
		this.aCreate	= new AdminCreateCourse();
		this.aAssign 	= new AdminAssignCourse();
		this.tab		= new JTabbedPane();
		
		this.tab.addTab("Profile", this.aProfile);
		this.tab.addTab("Create Course", this.aCreate);
		this.tab.addTab("Assign Course",this.aAssign);
		
		this.add(tab);
		
	}
}