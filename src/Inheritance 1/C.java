public class C extends B
{
	public int x = 10;
	
	C()
	{
		//this();
		System.out.println("C empty const");
	}
	C(int a)
	{
		super(10);
		System.out.println("C Valued const");
	}
}