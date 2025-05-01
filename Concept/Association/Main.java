package Concept.Association;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Car  car = new Car();

        Driver driver = new Driver();

        car.showCar();
        driver.driverCar(car);
    }
}
