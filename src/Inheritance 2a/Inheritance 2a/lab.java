class Bank{
	void getInterest(){}
	double interestRate;
	static String name = "Coming Home!";
	
	
}

class DBBL extends Bank {
	// static point one place.
	void getInterest(){
		this.name = "joy";
		this.interestRate = 8.0;
		System.out.println("DBBL interest rate: "+interestRate +"Name: "+this.name);
	}
	
}

class EBL extends Bank {
	//this.interestRate = 11;
	//public EBL(){
		//System.out.println(interestRate);
	
	void getInterest(){
		this.interestRate = 10;
		System.out.println("EBL interest rate: "+interestRate+"Name: "+ name);
	}
}

class lab{
	public static void main(String[] args){
		Bank b = new DBBL();
		//Bank d = new Bank();
		//d.getInterest();
		
		b.getInterest();
		Bank c = new EBL();
		c.getInterest();
	}
}