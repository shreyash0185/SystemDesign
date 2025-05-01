package Concept.Association;

public class Driver {
    private String name;

    Driver(){
        this.name = name;
    }

    public void showDriver(){
        System.out.println("Driver Name: " + name);
    }

    public void driverCar(Car car){
            System.out.println("Driver " + name + " is driving the car.");
            car.showCar();
    }

    //Drive dont has a object of car but still getting obj of car inside the driverCar to drive the car
    //Driver is not composed of car - it Association relationship


}
