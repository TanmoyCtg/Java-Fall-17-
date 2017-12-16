public class Student
{
	String stdName;
	private String stdId;
	private String Dept;
	private Course [] course;
	private int courseCounter= 0;
	Account account;
	
	
	public Student( String stdName,String stdId,String Dept,Account account )
	{
		this.stdName=stdName;
		this.stdId=stdId;
		this.Dept=Dept;
		this.account = account; 
		this.course = new Course[10];
	}
	
	public void addCourse(Course temp)
	{
		if(courseCounter < 5)
		{
			if(account.withdraw()){
				course[courseCounter] = temp;
				courseCounter++;	
			}
		}
		else
		{
			System.out.println("you have already take 5 courses");
		}
	}

	public void dropCourse(Course temp)
	{
		int courseFoundFlag=0;
		
		for(int i=0; i<courseCounter; i++)
		{
			if(temp.getName() == course[i].getName()){
				courseFoundFlag=1;
				courseCounter--;
			}
			
			if(courseFoundFlag==1){
				course[i] = course[i+1];
			}
		}		
		if(courseFoundFlag==1) 
			System.out.println("Course Dropped");
	}
	
	public void show()
	{
		System.out.println("stdent name : "  +this.stdName);
		System.out.println("stdent id : "  +this.stdId);
		System.out.println("stdent dept : "  +this.Dept);
		for(int i=0;i<this.courseCounter;i++)
		{
			this.course[i].showCourse();
		}
		account.showAcc();
		System.out.println("********************************");
	}
}