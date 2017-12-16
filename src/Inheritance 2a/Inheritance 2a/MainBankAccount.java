class MainBankAccount{
	public static void main(String[] args){
		Account1 ac1 = new Account1();
		System.out.println("After withdrawing: ");
		System.out.println(ac1.withdraw(400));
		System.out.println("After deposit: ");
		System.out.println(ac1.deposit(400));
	}
	
}