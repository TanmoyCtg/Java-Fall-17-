class StudentMain
{
   public static void main(String [] args)
   {
		System.out.println();
		System.out.println("********************************");
		
		Course Java = new Course("JAVA","JSC2");
		Account amin = new Account(12212,7000);
		Student alamin = new Student("Alamin","12-212","cse",amin);	
		alamin.show();
		System.out.println("----------After Course Add----------");
		alamin.addCourse(Java);	
		alamin.show();
   } 

}