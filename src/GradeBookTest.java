import java.util.Scanner;

public class GradeBookTest{
	// main method begins program execution
	public static void main(String[] args){
		// create scanner to obtain input from command window
		//Scanner input = new Scanner(System.in);
		// create a GradeBook object and assign it to myGradeBook
		//Gradebook myGradeBook = new Gradebook("Introduction to Java Programming!!");
		Gradebook gradeBook1 = new Gradebook("CS101 Data Structure in Java!!");
		Gradebook gradeBook2 = new Gradebook("CS101 Data Structure in Java!!");
		
		// initial value is null
		//System.out.printf("Initial Course name: %s\n\n",myGradeBook.getCourseName());
		System.out.printf("Gradebook1 course is: %s\n",gradeBook1.getCourseName());
		System.out.printf("Gradebook1 course is: %s\n",gradeBook2.getCourseName());
		// prompt for and read course name
		
		// prompt for and input course name
		//System.out.println("Please enter the course name:");
		//String theName = input.nextLine();
		//myGradeBook.setCourseName( theName ); // set the course name
		//System.out.println(); //outputs a blank line
		
		// call myGradeBook's displayMessage method
		//and pass nameOfCourse as an argument
		//myGradeBook.displayMessage();
	}
}
