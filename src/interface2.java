// interface inheritance

interface printable{
	void print();
}

interface showable extends printable{
	void show();
}

class testInterface implements printable, showable{
	public void print (){System.out.println("Hello");}
	public void show() {System.out.println("Welcome");}
}

public class interface2 {
public static void main(String[] args) {
	testInterface t = new testInterface();
	t.show();
	t.print();	
}}
