package Concept.SOLID.DIP.AfterDIP;

public class Car {

    private Engine engine;

//    public Car() {
//        this.dieselEngine = new DieselEngine("yhthg",5656,65656);
//    }
//


    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car is starting with " + engine.getEngineType());
    }

    public Engine getDieselEngine() {
        return engine;

    }

    public void setDieselEngine(Engine dieselEngine) {
        this.engine = dieselEngine;
    }
}


// Hight level module - Car Is depend on Low level module - Abstract class - Engine

// High Level module Engine is depend on Low level module - Concrete class - DieselEngine


//    Car ----> Engine ------> DieselEngine , PetrolEngine

//High level module - Car is not depend on low level module like petrol or desigl it is depend Abstraction - Abstract class - Engine


//To Achive Dependency Inversion Principle have to do Dependency Injection
//If you have follow the Dependency Injection then you have to follow Liskov Substitution Principle