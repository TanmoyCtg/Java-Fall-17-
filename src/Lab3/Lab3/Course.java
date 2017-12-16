class Course{

	private String name;
	
	public Course(){
		this("undefined");
	}
	public Course(String name){
		this.name=name;
	}
	public void show(){
		System.out.println("\nCourse Name: "+name);
	}
	public String getName(){
		return this.name;
	}
	
}