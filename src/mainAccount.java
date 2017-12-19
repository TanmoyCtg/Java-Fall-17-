public class mainAccount{
	public static void main(String[] args){
		Account1 ac1 = new Account1();
		Account1 ac2 = new Account1(1,2400);
		ac1.showAccount();
		ac2.showAccount();
		System.out.println(ac1.withdraw());
	}
}