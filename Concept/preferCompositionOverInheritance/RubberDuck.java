package Concept.preferCompositionOverInheritance;

public class RubberDuck extends BaseDuck{

    public String rubberType;
    public RubberDuck(int hands, int legs, int bea, String rubberType) {
        super(hands, legs, bea);
        this.rubberType = rubberType;
    }

  public void display() {
        System.out.println("I am a rubber duck, I have " + hands + " hands, " + legs + " legs, and "  + " beak.");
        System.out.println("I am made of " + rubberType + ".");
    }

    @Override
    public void squack() {
        System.out.println("I am a rubber duck, I don't quack!");
    }

    @Override
    public void swim() {
        System.out.println("I am a rubber duck, I float on water!");
    }


}
