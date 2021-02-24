package exercise2.ground;

import exercise2.Transport;

public class GroundTransport extends Transport {
    private int numberWheels;
    private double fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int weight, String brand, int numberWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.numberWheels = numberWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public GroundTransport() {
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + ", кол-во колес = " + numberWheels +
                "шт., расход топлива = " + fuelConsumption + "л/100км";
    }
}
