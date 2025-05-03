package Concept.afterCompositionOverInheritance.Behaviour;

public class SqueakWithDecibel implements SqueakBehaviour{

    private int decibel;

    public SqueakWithDecibel(int decibel) {
        this.decibel = decibel;
    }

    @Override
    public void squeak() {
        System.out.println("Squeaking at " + decibel + " decibels.");
    }
}
