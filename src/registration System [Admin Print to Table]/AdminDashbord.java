import javax.swing.*;

public class AdminDashbord extends JFrame{
	
	//AdminProfile 			aProfile;
	//AdminAssignCourse 	aAssign;
	
	AdminCreateCourse 	aCreate;
	JTabbedPane			tab;
	Admin 	a1;
	
	public AdminDashbord(){
		this.setTitle("Admin Dashbord");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		
		addComponentToFrame();
		this.setVisible(true);
	}
	
	public void addComponentToFrame(){
		
		this.a1 = new Admin(1221, "Rakib", "27");
		 
		//this.aProfile 	= new AdminProfile(this, a1);
		//this.aAssign 	= new AdminAssignCourse();
		this.aCreate	= new AdminCreateCourse(this, a1);
		this.tab		= new JTabbedPane();
		
		//this.tab.addTab("Profile", this.aProfile);
		//this.tab.addTab("Assign Course",this.aAssign);
		this.tab.addTab("Create Course", this.aCreate);
		this.add(tab);
	}
}