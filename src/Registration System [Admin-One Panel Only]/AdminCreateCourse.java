import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;
import java.util.ArrayList;

public class AdminCreateCourse extends JPanel{
	
	JButton btn2, btn4;
	AdminDashbord frame;
	Admin a1;
	
	public AdminCreateCourse(AdminDashbord frame, Admin a1){
		this.a1=a1;
		this.frame=frame;
		this.setLayout(null);
		this.setBackground(new Color(125,25,125));
		addComponentToPanel();
	}
	
	public void addComponentToPanel(){
		this.btn2 = new JButton("Create Course");
		this.btn4 = new JButton("Show Course");
		this.btn2.setBounds(100, 250, 150, 30);
		this.btn4.setBounds(260, 250, 150, 30);
		this.add(btn2);
		this.add(btn4);
		
		this.btn2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
			
				a1.createCourse("JAVA",10000,"1212");
				a1.createCourse("CN",10000,"1213");
				a1.createCourse("ACN",10000,"1214");
			}
		});
		
		this.btn4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				ArrayList<Course> list = a1.courseList();
				
				System.out.println("---------------All Courses---------------");
				for(int i=0;i<list.size();i++)
				{
					System.out.print(list.get(i).getCourseName()+"  ");
					System.out.print(list.get(i).getCourseFee()+"  ");
					System.out.print(list.get(i).getCourseId());
					System.out.println();
				}
				System.out.println("---------------***---------------");
			}
		});
	}
}