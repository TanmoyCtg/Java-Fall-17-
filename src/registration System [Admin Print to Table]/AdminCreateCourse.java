import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;
import java.util.ArrayList;
import javax.swing.table.*;

public class AdminCreateCourse extends JPanel{
	
	JButton btn2, btn3, btn4;
	AdminDashbord frame;
	Admin a1;
	
	static Object[][] databaseInfo;
	static DefaultTableModel dTableModel;
	
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
				JOptionPane.showMessageDialog(null, "Course Created Successfully!");
			}
		});
		
		this.btn4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
		
				Object[] columns = {"CourseId", "CourseName", "CourseFee"};
				dTableModel = new DefaultTableModel(databaseInfo, columns);
				
				ArrayList<Course> list = a1.courseList();
				Object[] tempRow = new Object[3];
				
				for(int i=0;i<list.size();i++){
					
					tempRow[0]=list.get(i).getCourseId();
					tempRow[1]=list.get(i).getCourseName();
					tempRow[2]=list.get(i).getCourseFee();
					
					dTableModel.addRow(tempRow);
				}
				
				JTable table = new JTable(dTableModel);
				table.setRowHeight(table.getRowHeight()+10);
				table.setAutoCreateRowSorter(true);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

				TableColumn col1 = table.getColumnModel().getColumn(0);
				col1.setPreferredWidth(100);
				
				TableColumn col2 = table.getColumnModel().getColumn(1);
				col2.setPreferredWidth(190);
				
				TableColumn col3 = table.getColumnModel().getColumn(2);
				col3.setPreferredWidth(150);
				
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(50,50,458,100);
				add(scrollPane);
			}
		});
	}
}