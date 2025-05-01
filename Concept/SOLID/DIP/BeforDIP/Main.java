package Concept.SOLID.DIP.BeforDIP;

public class Main {
    public static void main(String[] args) {

        DieselEngine dieselEngine = new DieselEngine("sds",533 ,34322) ;
        DieselEngine dieselEngine2 = new DieselEngine("sds",533 ,34322) ;


//        Car car = new Car();
//        Car car2 = new Car();
//

        Car car = new Car(dieselEngine);
        Car car2 = new Car(dieselEngine2);

        car.start();
        car2.start();

    }
}

//Now mager came and saif you have to support to petrol engine
// so we have to add petrol engine in our code
//disel capacithy is also changes

//Inside car insted fo ingin intialize there why not take dependancy being injected ?
//so we can you any Engine

//Priously it was tightly coupled -> Now we are passing Disel Engine Directly as dependancy
////So we are not tightly coupled with the engine


//This is called as Constructor Based Dependacy Injection