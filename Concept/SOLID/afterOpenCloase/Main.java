package Concept.SOLID.afterOpenCloase;

public class Main {
    public static void main(String[] args) throws Exception {
       Shape circle = new Circle(5);
        Shape square = new Square(4);

        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Circle area: " + areaCalculator.calculateArea(circle));
        System.out.println("Square area: " + areaCalculator.calculateArea(square));


        //For L Principle
        //Point Does not have area
        Shape point = new Point(1, 2);
        System.out.println("Point area: " + areaCalculator.calculateArea(point)); // This will throw an exception

        //Here I have Followed the Open Close Principle - But Liskov Substitution Principle is not followed
        //Whatever the Parent is giving you - you have to fulfill that contract if you dont the child can not be substitutes as parent and it will violate the Liskov Substitution Principle
        //So we have to make sure that the child class is substitutable for the parent class


        //If you Follow O you Have to Follow L
        //But wise versa is not true

        //If you Follow L you may not follow O
        //Example -




    }
}

//If new Requirement came to add new shape No need to change any Code
//added circle class which Implements Shape interface and can be user in main Directly
//Calculator is Lossly Coupled with Shape interface
//we use programing of Interface rather than Concreate class
//we can add any shape in future without changing the code
//Classes cloe for modification but open for extension

