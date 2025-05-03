package Concept.afterCompositionOverInheritance;

import Concept.afterCompositionOverInheritance.Behaviour.SqueakBehaviour;
import Concept.afterCompositionOverInheritance.Behaviour.SqueakWithDecibel;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SqueakBehaviour squeakBehaviour = new SqueakWithDecibel(20);
        squeakBehaviour.squeak();

        BaseDuck rubberDuck = new RubberDuck(2,2,1,squeakBehaviour);

        // Inheritance is a mechanism in which one class acquires the properties and behaviors of another class. The class that inherits is called the subclass or child class, and the class from which it inherits is called the superclass or parent class.
    }



}

//prefer Composition over inheritance -> to Encapulate the behaviour
//Achived using Dependency Injection - Constructor bas Injection

