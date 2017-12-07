
// Employee is abstract super class
public abstract class Employee {
    // declare three private variable
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // declare a constructor
    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    }

    // set the employee first name
    void setFirstName(String first) {
        firstName = first;
    }

    // return the get name
    String getFirstName() {
        return firstName;
    }

    void setLastName(String last){
        lastName = last;
    }
    String getLastName(){
        return lastName;
    }

    void setSocialSecurityNumber(String ssn){
        socialSecurityNumber = ssn;
    }
    String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    // return or represent nicely representation employee object
    public String toString(){
        return String.format("%s %s\nsocial security number: %s",getFirstName(),getLastName(),getSocialSecurityNumber());

    }
   // abstract method overridden by subclasses
   public  abstract double earnings(); // no implementation here
} // end abstract class employee
