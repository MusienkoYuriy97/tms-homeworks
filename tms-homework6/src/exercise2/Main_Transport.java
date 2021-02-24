package exercise2;

import exercise2.air.CivilianPlane;
import exercise2.air.MilitaryPlane;
import exercise2.ground.CargoTruck;
import exercise2.ground.PassengerCar;

public class Main_Transport {
    public static void main(String[] args) {
        //transports
        CivilianPlane civilPlane = new CivilianPlane(5000,1200,280,"Airbus-380",80,2200,500,true);
        MilitaryPlane militaryPlane = new MilitaryPlane(8800,600,280,"Boeing b-29",43,1500,true,30);
        CargoTruck cargoTruck = new CargoTruck(600,160,7,"Mercedes-Benz",4,25,9);
        PassengerCar passengerCar = new PassengerCar(300,230,2,"Audi",4,8,"Седан",5);

        //information
        System.out.println(civilPlane.toString());
        System.out.println(militaryPlane.toString());
        System.out.println(cargoTruck.toString());
        System.out.println(passengerCar.toString());

        //для гражданского тест методов
        System.out.println();
        System.out.println("У гражданского самолета " + civilPlane.getBrand() + " посадочных мест = " + civilPlane.getNumberOfPassenger());
        int ld = 300;
        civilPlane.load(ld);
        System.out.println("После того как в самолет сели " + ld + " человек, посадочных мест осталось " + civilPlane.getNumberOfPassenger());
        System.out.println("Попробуем загрузить ещё " + ld + " человек");
        civilPlane.load(ld);

        //для военного тест методов
        System.out.println();
        System.out.println("Количество ракет на борту военного самолета " + militaryPlane.getBrand() + " = "  + militaryPlane.getNumberOfRocket());
        int unLd = 16;
        militaryPlane.unLoad(unLd);
        System.out.println("Запускаем " + unLd + " ракет, на борту осталось всего " + militaryPlane.getNumberOfRocket());
        System.out.println("Попробуем запустить ещё " + unLd);
        militaryPlane.unLoad(unLd);
        militaryPlane.ejection();
        militaryPlane.ejection();

        //для грузового автомобиля тест
        System.out.println();
        System.out.println("Грузоподъемность грузовика " + cargoTruck.getBrand() + " = "  + cargoTruck.getLoadCapacity() + " тонн");
        ld = 5;
        cargoTruck.load(ld);
        System.out.println("Загрузим в наш грузовик " + ld + " тонн груза, гузоподъемность теперь = " + cargoTruck.getLoadCapacity() + " тонн");
        System.out.println("Попробуем загрузить ещё " + ld + " тонн");
        cargoTruck.load(ld);

        //для легкового автомобиля тест
        System.out.println();
        passengerCar.distanceAtMaxSpeed(2.5);

    }
}
