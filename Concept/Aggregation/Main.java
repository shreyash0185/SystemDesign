package Concept.Aggregation;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Engine engine = new Engine("V8");
        Car car = new Car("V8",engine);

        car.showCar();


        //When class has the instance variable of another class then  its as has a relation ship
//        if relationship is week then its called aggregation
//         else if the relation is strong then its called composition
        // in aggregation if the parent class is destroyed then child class can still exist
        // in composition if the parent class is destroyed then child class also destroyed


    }

}
