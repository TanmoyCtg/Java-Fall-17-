// SalariedEmployee extends Employee simply inherit
public class SalariedEmployee extends Employee{

    private double weeklySalary;

   public SalariedEmployee(String first, String last, String ssn,double salary){
       super(first,last,ssn); // pass to Employee constructor
       setWeeklySalary(salary); //this function store salary
   }
   public void setWeeklySalary(double salary){
        weeklySalary = salary < 0.0 ? 0.0 : salary;
   }
   public double getWeeklySalary(){
       return weeklySalary;
   }
   // override abstract method
   public double earnings(){
       return getWeeklySalary();
   }
   public String toString(){
       return String.format("salaried employee: %s\n%s: $%,2f",super.toString(),"weekly salary",getWeeklySalary());
   } //

}
