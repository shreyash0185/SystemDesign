package Concept.Association;

public class Car {

    private String model;

    Car(){
        this.model = "Default Model";
    }

    public void showCar(){
        System.out.println("Car Model: " + model);
    }
}
