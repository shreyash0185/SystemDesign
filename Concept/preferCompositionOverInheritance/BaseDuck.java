package Concept.preferCompositionOverInheritance;

public class BaseDuck {

    int hands;

    int legs;

    int beak;

    public BaseDuck(int hands, int legs, int beak) {
        this.hands = hands;
        this.legs = legs;
        this.beak = beak;
    }

    public int getHands() {
        return hands;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getBeak() {
        return beak;
    }

    public void setBeak(int beak) {
        this.beak = beak;
    }

    public void squack() {
        System.out.println("Quack");
    }

    public void swim() {
        System.out.println("Swim");
    }

    public void walk() {
        System.out.println("Walk");
    }

}

//→ Problem 1 → If a child no use half thing still he need to impl all things
//
//→ Tight Coupling
//
//→ Problem 2 → If we change the behavior in the parent class, then we need to update all child class implementations of that method – this is known as the Ripple Effect.


//to resolve take out what ever is changing and take it out
// Inheritance is required for comman data firlds
//Pull out all behaviour from base class and put them out side
//This is called composition