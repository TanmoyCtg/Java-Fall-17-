import java.sql.*;
import java.util.ArrayList;

public class Admin extends Person implements iAdmin
{
	
	public Admin(int id, String name, String age)
	{	
		this.id=id;
		this.name=name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(String name){
		return name;
	}
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	
	public void setAge(String age){
		this.age=age;
	}
	public String getAge(String age){
		return age;
	}
	
	void showInfo(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			Statement stmt = con.createStatement();
			String sql= "select * from emp where name='"+this.name+"'";
			ResultSet rs   = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
			
			con.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void createCourse(String name, int courseFee, String id){

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			Statement stmt = con.createStatement();
			String sql2 = "INSERT INTO `course`(`courseId`, `courseName`, `courseFee`) VALUES ("+id+",'"+name+"','"+courseFee+"')";
			int rs   = stmt.executeUpdate(sql2);
			
			System.out.println("Course Created: "+rs);
			con.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void showCourses()
	{	
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			Statement stmt = con.createStatement();
			String sql= "select * from course";
			ResultSet rs   = stmt.executeQuery(sql);
			
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
			
			con.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public ArrayList<Course> courseList(){
		
		ArrayList<Course> courseList = new ArrayList<Course>();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			Statement stmt = con.createStatement();
			String sql= "select * from course";
			ResultSet rs   = stmt.executeQuery(sql);
			
			Course course;
			
			while(rs.next())
			{
				course = new Course(rs.getString(2), rs.getInt(3), rs.getString(1));
				courseList.add(course);
			}
			
			con.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		return courseList;
	}
	
}