package Concept.preferCompositionOverInheritance;

public class LakeDuck extends BaseDuck {

    private String lakeType;
    public LakeDuck(int hands, int legs, int beak) {
        super(hands, legs, beak);
        this.lakeType = "Freshwater";
    }

    public void display() {
        System.out.println("I am a Lake Duck with " + getHands() + " hands, " + getLegs() + " legs, and a beak of size " + getBeak() + ".");
        System.out.println("I live in a " + lakeType + " lake.");
    }

    public String getLakeType() {
        return lakeType;
    }

    public void setLakeType(String lakeType) {
        this.lakeType = lakeType;
    }

    @Override
    public void swim() {
        System.out.println("I am swimming in a lake."+ getLakeType());
    }
}
