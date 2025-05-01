package Concept.SOLID.DIP.BeforDIP;

public class DieselEngine extends Engine {

    int dieselTankCapacity;

    public DieselEngine(String engineType, int horsePower,int dieselTankCapacity) {
        super(engineType, horsePower);
        this.dieselTankCapacity = dieselTankCapacity;
    }
    public int getDieselTankCapacity() {
        return dieselTankCapacity;
    }
    public void setDieselTankCapacity(int dieselTankCapacity) {
        this.dieselTankCapacity = dieselTankCapacity;
    }
}
