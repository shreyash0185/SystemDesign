package Concept.Aggregation;

public class Engine {
    private String type;

    Engine(String type){
        this.type = type;
    }

    public void showEngine(){
        System.out.println("Engine type: "+type);

    }

}
