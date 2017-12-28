public class Gradebook{
	// display a welcome message to the Gradebook user
	private String courseName;
	
	public Gradebook (String name){
		courseName = name;
		//end contructor
	}
	// method to set the course Name
	public void setCourseName(String name){
		courseName=name;
	}
	// method to retrive the course name
	public String getCourseName(){
		return courseName;
	}
	public void displayMessage(){
		System.out.printf("Welcome to the Grade Book for \n%s!\n!",getCourseName());
	} // end method displayMessage
}// end class Gradebook

