class Student{

	private String stdId;
	private String stdName;
	private String stdDept;
	
	static int courseLimit=10;
	Course course[];
	int courseCounter;
	
	public Student(){
		this("undefined","undefined","undefined");
	}
	
	public Student(String id,String name){
		this(id,name,"undefined");
	}
	
	public Student(String id,String name,String dept){
		this.stdId=id;
		this.stdName=name;
		this.stdDept=dept;
		this.courseCounter=0;
		course = new Course[10];
	}
	
	public void show(){
		System.out.println("\nId: "+stdId);
		System.out.println("Name: "+stdName);
		System.out.println("Department: "+stdDept);
	}
	
	public void addCourse(Course temp)
	{
		if(courseCounter < courseLimit){
			course[courseCounter] = temp;
			courseCounter++;
			System.out.println("Course Added");
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
	
	public void showCourses(){
		
		for(int i=0;i<courseCounter;i++){
			System.out.println(course[i].getName());
		}
	}
	
}