public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commisionRate;
    public CommissionEmployee(String first, String last, String ssn, double sales, double rate){
        super(first,last,ssn);
        setGrossSales(sales);
        setCommisionRate(rate);
    }
    public void setGrossSales(double sales){
        grossSales = (sales < 0.0) ? 0.0 : sales;
    }
    public void setCommisionRate(double rate){
        commisionRate = (rate >0.0 && rate <1.0)?rate : 0.0;
    }
    public double getGrossSales(){return grossSales;}
    public double getCommisionRate() {return commisionRate;}

    public double earnings(){
        return getCommisionRate() * getGrossSales();
    }
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f;%s;%.2f","commision Employee",super.toString()
        ,"gross sales",getGrossSales(),"commision rate",getCommisionRate());
    }
}
