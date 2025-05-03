package Concept.afterCompositionOverInheritance;

import Concept.afterCompositionOverInheritance.Behaviour.SqueakBehaviour;
import Concept.afterCompositionOverInheritance.Behaviour.SwimBehavior;
import Concept.afterCompositionOverInheritance.Behaviour.WalkBehavior;
import Concept.preferCompositionOverInheritance.BaseDuck;

public class LakeDuck extends BaseDuck {

    private SwimBehavior swimBehavior;

    private WalkBehavior walkBehavior;

    private SqueakBehaviour squeakBehaviour;

    public LakeDuck(int hands, int legs, int beak ,
            SwimBehavior swimBehavior,
            WalkBehavior walkBehavior,
            SqueakBehaviour squeakBehaviour) {
        super(hands, legs, beak);
        this.swimBehavior = swimBehavior;
        this.walkBehavior = walkBehavior;
        this.squeakBehaviour = squeakBehaviour;
    }

    public void swim() {
        swimBehavior.swim();
    }

    public void walk() {
        walkBehavior.walk();
    }

    public void squeak() {
        squeakBehaviour.squeak();
    }
}

//Programing to Interface rather than concreate
//Inject any type of dependancy follw dependancy inversion principle

//No function are controller by who is creating the Obj
////No need to change the code in the class
//Loos Couppling

