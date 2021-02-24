package exercise2.ground;

public class CargoTruck extends GroundTransport {
    private int loadCapacity;

    public CargoTruck(int power, int maxSpeed, int weight, String brand, int numberWheels, int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, brand, numberWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public CargoTruck() {
    }

    public void load(int t){
        if (loadCapacity - t >= 0) {
            loadCapacity -= t;
        }else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль - {" + super.toString() + ", грузпод. = " + loadCapacity + " т. }";
    }
}
