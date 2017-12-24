// inheritance apply here 
// code re usability
class Programmer{
	float salary=4000;
}
class Employe extends Programmer{
	int bonus = 10000;

	public static void main(String[] args){
		Employe p = new Employe();
		System.out.println("Programmer salary is: "+p.salary);
		System.out.println("Bonus of programmer is:"+p.bonus);
	}
}