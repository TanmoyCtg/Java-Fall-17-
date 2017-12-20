public class Account1{
	private int accountNumber;
	private int accountBalance;
	public Account1() {this(0,0);}
	public Account1 (int acN,int acB){
		accountBalance = acB;
		accountNumber = acN;
	}
	public void showAccount (){
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Balance: "+accountBalance);
	}
	public boolean  withdraw (){
		if (accountBalance < 5000){
			System.out.println("Withdraw failed");
			return false;
		}
		else{
	
			accountBalance = accountBalance - Course.courseFee;
			return true;
		}
	}
	public boolean deposit (){
		accountBalance = accountBalance+Course.courseFee;
		return true;
	}
	
	
}

// create course class object.
// j varibale static class er name dia call korte pari
// drop teke deposit korbo
// drop korle account + hobe
// account er deposit add hobe
// boolean type

// 