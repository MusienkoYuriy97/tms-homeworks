public class MainCar {
    public static void main(String[] args) {
        Car[] cars = new Car[2];

        cars[0] = new Car("Audi",250,15000);
        cars[1] = new Car("BMW",300,32000);

        for (Car car:cars) {
            try {
                car.start();
            } catch (EvenNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
