package Concept.SOLID.LSP.BeforLSP;

public class Ostrich extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich cannot fly");
    }
}
