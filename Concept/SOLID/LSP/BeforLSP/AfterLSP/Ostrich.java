package Concept.SOLID.LSP.BeforLSP.AfterLSP;

public class Ostrich extends Bird {



    public void walk() {
        System.out.println("I can walk");
    }

    @Override
    public void move() {
        walk();
    }
}
