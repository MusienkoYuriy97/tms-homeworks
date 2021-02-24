package exercise1;

import exercise1.engine.DieselEngine;
import exercise1.engine.Engine;
import exercise1.engine.GasEngine;
import exercise1.transmission.AutomatedManualTransmission;
import exercise1.transmission.AutomaticTransmission;
import exercise1.transmission.ManualTransmission;
import exercise1.transmission.Transmission;

public class Main_Car {
    public static void main(String[] args) {
        //двигатели
        Engine gasEngine = new GasEngine(200);
        Engine dieselEngine = new DieselEngine(230,2);
        //коробки передач
        Transmission aT = new AutomaticTransmission(8);
        Transmission mT = new ManualTransmission(5);
        Transmission amT = new AutomatedManualTransmission(6);

        //тест 1 как на занятии
        Car car_1 = new Car("Audi", 27500, dieselEngine);
        car_1.start();
        System.out.println(car_1.toString());

        System.out.println();

        //тест 2 как на занятии + коробка передач
        Car car_2 = new Car("Volvo",15000,gasEngine, aT);
        car_2.start();
        System.out.println(car_2.toString());

    }
}
