public class addVar{
	public static void main(String[] args){
		The keyword static, when applied to a method or a member variable, simply means that this method (or member variable) is defined for the class, but not for particular objects in the class. Thus, main is a general method. There is no "calling object" inside main. If you want to call instance methods from main, you must create objects and then call the instance methods on those objects. You can, however, call other static methods directly.The keyword static, when applied to a method or a member variable, simply means that this method (or member variable) is defined for the class, but not for particular objects in the class. Thus, main is a general method. There is no "calling object" inside main. If you want to call instance methods from main, you must create objects and then call the instance methods on those objects. You can, however, call other static methods directly.addSubstract(10,2);
		int a = 10;
		int b = 10;
		int c = a+b;
		System.out.println(c);
	}
	void addSubstract(int a, int b){
		int c = a-b;
		System.out.println(c);
		
	}
	
}