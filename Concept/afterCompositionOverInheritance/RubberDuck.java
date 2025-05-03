package Concept.afterCompositionOverInheritance;

import Concept.afterCompositionOverInheritance.Behaviour.SqueakBehaviour;

public class RubberDuck extends BaseDuck{

    private SqueakBehaviour squeakBehaviour;
    public RubberDuck(int hands, int legs, int beak, SqueakBehaviour squeakBehaviour) {
        super(hands, legs, beak);
        this.squeakBehaviour = squeakBehaviour;
    }

    public void squeak() {
        squeakBehaviour.squeak();
    }

    public void display() {
        System.out.println("I am a rubber duck.");
    }

}
