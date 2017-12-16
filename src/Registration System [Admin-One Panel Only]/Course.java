
public class Course{

	public String 	courseName;
	public String 	courseId;
	static int 		courseFee;
	
	public Course(){
		this("undefined",0,"undefined") ;
	}
	
	public Course(String name, int courseFee, String id){
		this.courseName=name;
		this.courseFee=courseFee;
		this.courseId = id;
	}
	
	
	public void setCourseName(String name){
		this.courseName=name;
	}
	public String getCourseName(){
		return this.courseName;
	}
	
	public void setCourseFee(int courseFee){
		this.courseFee=courseFee;
	}
	public int getCourseFee(){
		return this.courseFee;
	}
	
	public void setCourseId(String courseId){
		this.courseId=courseId;
	}
	public String getCourseId(){
		return this.courseId;
	}
}