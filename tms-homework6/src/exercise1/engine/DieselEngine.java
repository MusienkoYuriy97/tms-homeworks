package exercise1.engine;

public class DieselEngine extends Engine {
    private int fuelTankCapacity;

    public DieselEngine(int power, int fuelTankCapacity) {
        super(power);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public DieselEngine() {
    }

    public void start(){
        System.out.println("Starting the diesel engine, power = " + getPower() + " horsepower , fuel-tank capacity = " + fuelTankCapacity);
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }
}
