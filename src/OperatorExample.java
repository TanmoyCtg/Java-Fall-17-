class OperatorExample{
	public static void main(String[] args){
		int x = 10;
		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a); // 10 + 12 =22
		System.out.println(++b + ++b); // 11 + 12 = 23
		System.out.println(x++);//10
		System.out.println(++x);//12
		System.out.println(--x);//11
		System.out.println(x--);
		// left shift
		System.out.println(10<<2);//10*2^2 = 10*4 = 40
		System.out.println(10<<3); //10*2^3 = 10*8 = 80
		System.out.println(20<<2); // 20*2^2 = 20*4 = 80
		System.out.println(15<<4); //15*2^4 = 15*16 = 240
		
		//Right Shift
		System.out.println(10>>2);// 10/2^2 = 10/4 = 2
		System.out.println(20>>2); 
		System.out.println(20>>3);
		
		// Ternary operator
		int e = 2;
		int f = 4;
		int min = (e<f)?a:b;
		System.out.println(min);
	}
}