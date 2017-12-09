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
        // Employee got 4 object we need to store those object in array

        Employee employees[] = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees processed polymorphically:\n");

        // foreach loop
        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee)
            {

                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                double oldBaseSalary = employee.getBaseSalary();
                employee.setBaseSalary(1.10 * oldBaseSalary);
                System.out.printf("new base salary with 10% increase is: $%,.2f\n",employee.getBaseSalary());
            }
            System.out.printf("earned $%,.2f\n\n",currentEmployee.earnings());
        }
        for (int j = 0; j < employees.length;j++){
            System.out.printf("Employee %d is a %s\n",j,employees[j].getClass().getName());
        }
    }
}
