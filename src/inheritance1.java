class A{
	protected int a=1;
	protected String name ="joy";
	protected int b = 2;
}

class B extends A{
	a = 4;
	System.out.println(a);
	public B(){
	
	System.out.println(this.a);
	System.out.println(this.name);
	}
	void addition (int c, int d){
		a = c;
		b = d;
		
	}
}

class C extends B{
	public C(){
		System.out.println(this.a);
		System.out.println(this.b);
	}
}

class inheritance1{
	public static void main(String[] args){
		B b = new B();
		C c = new C();
		A a = new A();
		a.a = 2;
		B d = new B();
	}
}