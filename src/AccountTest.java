import java.util.Scanner;

public class AccountTest{
	public static void main(String[] args){
		Account account1 = new Account(50.00);
		Account account2 = new Account(7.53);
		
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance() ); // 50.00
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance() ); // 7.53
		
		Scanner input = new Scanner(System.in);
		double depositAmount; //deposit Amount read from user
		System.out.print("Enter deposit amount for account1: ");
		depositAmount = input.nextDouble(); //obtain user input
		System.out.printf("\nadding %.2f to account1 balance\n\n",depositAmount);
		account1.credit(depositAmount);
		
		//display balance
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance()); // now change the value
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());//same as it is 
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble(); //obtain user input
		System.out.printf("\nadding %.2f to account2 balance\n\n",depositAmount);
		account2.credit(depositAmount);
		
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());
						
	}
}