import java.util.Scanner;

public class Analysis{
	public void processExamResults()
	{
		Scanner input = new Scanner(System.in);
		int passes = 0;
		int failures =0;
		int studentCounter = 1; // student counter
		int result;

		while(studentCounter <= 10){
			System.out.println("Enter result (1=pass, 2= fail): ");
			result = input.nextInt();
			if (result == 1){
				passes++;
			}
			else{
				failures++;
			}
			studentCounter++;
		}
		System.out.printf ("Passed: %d\nFailed: %d\n",passes,failures);
		if (passes >8){
			System.out.println("Raise Tuition");
		}
	}
}