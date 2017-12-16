public class A
{
	public int x = 10;
	
	A()
	{
		System.out.println("A empty const");
	}
	A(int a)
	{
		this();
		System.out.println("A Valued const");
	}
}