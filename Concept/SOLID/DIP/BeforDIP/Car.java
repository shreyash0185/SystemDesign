package Concept.SOLID.DIP.BeforDIP;

public class Car {

    private DieselEngine dieselEngine;

//    public Car() {
//        this.dieselEngine = new DieselEngine("yhthg",5656,65656);
//    }
//


    public Car(DieselEngine dieselEngine) {
        this.dieselEngine = dieselEngine;
    }

    public void start() {
        System.out.println("Car is starting with " + dieselEngine.getEngineType());
    }

    public DieselEngine getDieselEngine() {
        return dieselEngine;

    }

    public void setDieselEngine(DieselEngine dieselEngine) {
        this.dieselEngine = dieselEngine;
    }
}
