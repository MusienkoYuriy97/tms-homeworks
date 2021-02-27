package exercise1.engine;

public class GasEngine extends Engine {

    public GasEngine(int power) {
        super(power);
    }

    public GasEngine() {
    }

    public void start(){
        System.out.println("Starting the gas engine , power = " + getPower() + " horsepower");
    }
}
