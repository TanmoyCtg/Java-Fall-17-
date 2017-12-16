public abstract class Person {
    private int age;
	
    public Person() {
	   this(0);
	   System.out.println("Inside Person's Empty.");
    }
	
    public Person(int a) {
		this.age = a;
		System.out.println("Person's constructor - Valued.");
    }
	
    public int getAge(){return this.age;}
    
	public abstract void showInfo();
}  // End of Class Person

