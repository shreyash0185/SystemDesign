package Concept.SOLID.ISP.BeforeISP;

public class Robote implements Worker {

    @Override
    public void work() {
        System.out.println("Robote is working");
    }

    @Override
    public void eat() {
        // Robote does not eat
        throw new UnsupportedOperationException("Robote does not eat");
    }

    @Override
    public void sleep() {
        // Robote does not sleep
        throw new UnsupportedOperationException("Robote does not sleep");
    }

    @Override
    public void takeBreak() {
        // Robote does not take breaks
        throw new UnsupportedOperationException("Robote does not take breaks");
    }

    //No need for Sleep, Eat, TakeBreak for Robote but still need to added which cause a problem for this we need ISP
    //we segrigate the 2 interfeces sperate for Robote and Human and Implement them seprately

}
