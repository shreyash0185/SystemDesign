package Concept.SOLID.ISP.AfterISP;

public class Robot implements Workable {

    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    // No need to implement eat, sleep, or takeBreak methods
    // as Robot does not require them.

}
