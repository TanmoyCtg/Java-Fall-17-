public class HourlyEmployee extends Employee {
    private double wage;
    private int Hours;
    public HourlyEmployee(String first, String last, String ssn, double hourlyWage,int hours){
        super(first,last,ssn);

    }
    // set wage
    public void setWage(double hourlyWage){
        wage = (hourlyWage <0.0 )? 0.0 : hourlyWage;
    }
    public double getWage(){
        return wage;
    }
    public void setHours(int hours){
        Hours = ((hours >= 0) && (hours <=168)) ? hours:0;
    }

    public int getHours(){
        return Hours;
    }

    public double earnings(){
        if (getHours() <= 40) // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() * (getHours() - 40) * getWage() * 1.5;
    }
    public String toString(){
        return String.format("hourly employee: %s\n%s:","hours worked",getHours()
        ,super.toString(),"hourly wage",getWage());
    }
}
