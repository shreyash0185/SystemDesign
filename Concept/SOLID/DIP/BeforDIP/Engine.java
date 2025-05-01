package Concept.SOLID.DIP.BeforDIP;

public class Engine {
    private String engineType;
    private int horsePower;

    public Engine(String engineType, int horsePower) {
        this.engineType = engineType;
        this.horsePower = horsePower;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
