public class B extends A
{
	public int x = 10;
	
	B()
	{
		super(100);
		System.out.println("B empty const");
	}
	B(int a)
	{
		System.out.println("B Valued const");
	}
}