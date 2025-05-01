package Concept.SOLID.LSP.BeforLSP.AfterLSP;

public class Sparrow extends Bird {
    @Override
    public void move() {
        fly();
    }

    public void fly() {
        System.out.println("I can fly");
    }
}
