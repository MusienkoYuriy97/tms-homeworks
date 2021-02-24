package exercise2.ground;


public class PassengerCar extends GroundTransport {
    private String bodyType;
    private int numberOfPassenger;

    public PassengerCar(int power, int maxSpeed, int weight, String brand, int numberWheels, int fuelNeeded, String bodyType, int numberOfPassenger) {
        super(power, maxSpeed, weight, brand, numberWheels, fuelNeeded);
        this.bodyType = bodyType;
        this.numberOfPassenger = numberOfPassenger;
    }

    public PassengerCar() {
    }

    private double fuel(double d){
        return (d* getFuelConsumption()) / 100;
    }

    public void distanceAtMaxSpeed(double t){
        double distance = getMaxSpeed() * t;
        //double fuel = ((distance * getFuelConsumption()) / 100);
        System.out.println("За время " + t + "ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " +
                + getMaxSpeed() + " км/ч  проедет " + distance + "км и израсходует " + fuel(distance) +" литров топлива");
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль - {" + super.toString() + ", тип кузова = '" + bodyType + '\'' +
                ", кол-во пассажиров = " + numberOfPassenger + " }";
    }

}
