public class Main {
    public static void main(String [] args){
        Employee one = new Employee("joy","iftekhar","22222") {
            @Override
            public double earnings() {
                return 0;
            }
        };
        one.setFirstName("joy");
        one.setLastName("mozila");
        one.setSocialSecurityNumber("2932323");
        System.out.println(one.toString());
    }
}
