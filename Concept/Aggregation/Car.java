package Concept.Aggregation;

public class Car {

    private String model;

    //has a relation ship as Car has instance variable of another class
    // Engine is a part of Car but engin can still exits without car but car not

    private Engine engine;

    Car(String model , Engine engine){
        this.model = model;
        this.engine = engine;
    }

    public void showCar(){
        System.out.println("Car Model: " + model);
    }
}
