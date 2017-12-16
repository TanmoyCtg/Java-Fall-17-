public class Account
{
	private int accNo;
	private int accBalance;
	
	public Account()
	{
		this(000,000);
	}
	
	public Account(int accNo,int accBalance)
	{
		this.accNo = accNo;
		this.accBalance = accBalance; 

	}
	
	public boolean withdraw()
	{
		if(accBalance<5000)
		{
			
			System.out.println("withdraw failed");
			return false;
		}
		else
		{
		
			//System.out.println("withdraw succeed");
			accBalance=accBalance-Course.courseFee;
			return true;
		}
	}
	0
	public void showAcc()
	{
		System.out.println("account number : "  +this.accNo);
		System.out.println("account balance : "  +this.accBalance);
	}

}