package exercise2.air;

public class CivilianPlane extends AirTransport {
    private int numberOfPassenger;
    private boolean availabilityBusinessClass;

    public CivilianPlane(int power, int maxSpeed, int weight, String brand, int wingspan, int minLengthOfRunway, int numberOfPassenger, boolean availabilityBusinessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minLengthOfRunway);
        this.numberOfPassenger = numberOfPassenger;
        this.availabilityBusinessClass = availabilityBusinessClass;
    }

    public CivilianPlane() {
    }


    public void load(int t){
        if (numberOfPassenger - t >= 0) {
            numberOfPassenger -= t;
        }else {
            System.out.println("Не хватает посадочных мест");
        }
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public boolean isAvailabilityBusinessClass() {
        return availabilityBusinessClass;
    }

    public void setAvailabilityBusinessClass(boolean availabilityBusinessClass) {
        this.availabilityBusinessClass = availabilityBusinessClass;
    }

    @Override
    public String toString() {
        return "Гражданский самолет - {" + super.toString() + ", кол-во пассажиров = " + numberOfPassenger +
                ", наличие бизнес класса = " + availabilityBusinessClass + " }";
    }
}
