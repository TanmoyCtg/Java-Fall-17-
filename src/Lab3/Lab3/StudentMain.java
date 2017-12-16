class StudentMain{
	
	public static void main(String args[]){
		Student a1	= 	new Student("12312333","Rakib","CSE");
		a1.show();
		
		Course c1	=	new Course("Java");
		a1.addCourse(c1);
		a1.showCourses();
		
		a1.dropCourse(c1);
		a1.showCourses();
		
	}
}