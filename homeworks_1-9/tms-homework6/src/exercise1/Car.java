package exercise1;

import exercise1.engine.Engine;
import exercise1.engine.GasEngine;
import exercise1.transmission.Transmission;

public class Car {
    private String brand;
    private int price;
    private Engine engine;
    private Transmission transmission;


    public Car(String brand, int price, Engine gasEngine) {
        this.brand = brand;
        this.price = price;
        this.engine = gasEngine;
    }

    public Car(String brand, int price, Engine engine, Transmission transmission) {
        this.brand = brand;
        this.price = price;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(GasEngine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void start() {
        engine.start();
        if (transmission != null) {
            transmission.transmissionOn();
        }
        System.out.println(brand + " is started");
    }

    @Override
    public String toString() {
        if (transmission != null){
            return "Car{" +
                    "brand = '" + brand + '\'' +
                    ", price = " + price +
                    "$, engineType = " + engine.getClass().getSimpleName() +
                    ", transmissionType = " + transmission.getClass().getSimpleName() +
                    '}';
        }else {
            return "Car{" +
                    "brand = '" + brand + '\'' +
                    ", price = " + price +
                    "$, engineType = " + engine.getClass().getSimpleName() +
                    '}';
        }
    }
}
