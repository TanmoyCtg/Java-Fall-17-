public class Course
{
	private String courseName;
	private String courseId;
	static final int courseFee = 5000;

	public Course(){
		
		this("unknown course name","unknown course id");
	}
	
	public Course(String courseName, String courseId){
		
		this.courseName = courseName;
		this.courseId = courseId;
	}

	public void showCourse()
	{
		System.out.println("course fee : " + Course.courseFee);
		System.out.println("course name : "  +this.courseName);
		System.out.println("course id : "  +this.courseId);
	}
	
	public String getName(){
		return this.courseName;
	}
}