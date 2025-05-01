package Concept.SOLID.DIP.AfterDIP;

public class PetrolEngine extends Engine{

    int petrolTankCapacity;

    public PetrolEngine(String engineType, int horsePower , int petrolTankCapacity) {
        super(engineType, horsePower);
        this.petrolTankCapacity = petrolTankCapacity;
    }
    public int getPetrolTankCapacity() {
        return petrolTankCapacity;
    }
    public void setPetrolTankCapacity(int petrolTankCapacity) {
        this.petrolTankCapacity = petrolTankCapacity;
    }
}
