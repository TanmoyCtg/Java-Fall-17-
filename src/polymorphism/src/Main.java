

public class Main {
    public static void main(String [] args){
        // create subclass objects
        SalariedEmployee salariedEmployee = new
                SalariedEmployee("John","Smith","111-11-1111",800.00);
        HourlyEmployee hourlyEmployee = new
                HourlyEmployee("Karen","Price","222-22-2222",16.75,40);
        CommissionEmployee commissionEmployee = new
                CommissionEmployee("SUe","jones","333-33-3333",1000,0.6);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new
                BasePlusCommissionEmployee("Bob","Lewis","444-44-4444",5000,.04,300);

        System.out.println("Employees processed individually:\n");
        System.out.printf("%s\n%s:$%, .2f\n\n",salariedEmployee,"earned",salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%, .2f\n\n", hourlyEmployee,"earned",hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%, .2f\n\n", basePlusCommissionEmployee,"earned",basePlusCommissionEmployee.earnings());

        Employee employees[] = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        
    }
}
