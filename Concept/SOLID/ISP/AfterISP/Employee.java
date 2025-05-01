package Concept.SOLID.ISP.AfterISP;

public class Employee implements Workable, Eatable {

    @Override
    public void work() {
        // Implementation of work method
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        // Implementation of eat method
        System.out.println("Employee is eating");
    }

    // Other methods specific to Employee can be added here

}
