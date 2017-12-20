// Addition.java
// Addition program that displays the sum of two numbers

import java.util.Scanner; // program uses class Scanner

public class Addition{
	public static void main(String[] args){
	// main methods begins execution of java application
	Scanner input = new Scanner(System.in);
	int number1; //first number to add
	int number2; //second number to add
	int sum; 
	System.out.print("Enter First Integer:"); // prompt
	number1 = input.nextInt(); // read first number from user
	System.out.print("Enter Second Integer: ");
	number2 = input.nextInt(); // read second number from user
	
	sum = number1 + number2;
	
	System.out.printf("Sum is %d\n",sum); // display sum
	
	} //end method main
} // end class