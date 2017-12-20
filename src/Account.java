public class Account {
	
	private double balance; 
	//constructor
	public Account(double initialBalance){
		// validate that initialBalance is greter than 0.0;
		// if it is not, balance is initialized to the default value 0.0

		if(initialBalance>0){
			balance=initialBalance;
		}//end account constructor
	}
		public void credit(double amount){
			balance=balance+amount;
		}
		public double getBalance(){
			return balance;
		}	
	
	}
	
	