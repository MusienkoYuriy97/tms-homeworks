package exercise2.air;

public class MilitaryPlane extends AirTransport {
    private boolean availabilityEjectionSystem;
    private int numberOfRocket;
    private int counter = 0;

    public MilitaryPlane(int power, int maxSpeed, int weight, String brand, int wingspan, int minLengthOfRunway, boolean availabilityEjectionSystem, int numberOfRocket) {
        super(power, maxSpeed, weight, brand, wingspan, minLengthOfRunway);
        this.availabilityEjectionSystem = availabilityEjectionSystem;
        this.numberOfRocket = numberOfRocket;
    }

    public MilitaryPlane() {
    }

    public void unLoad(int t){
        if (numberOfRocket - t >= 0) {
            numberOfRocket -= t;
        }else {
            System.out.println("Не хватает боеприпасов");
        }
    }

    public void ejection(){
        if (counter > 0){
            System.out.println("Катапультирование уже было");
            return;
        }
        if (availabilityEjectionSystem){
            System.out.println("Катапультирование прошло успешно");
            counter++;
        }else {
            System.out.println("У вас отсутствует система катапультирования");
        }
    }

    public boolean isAvailabilityEjectionSystem() {
        return availabilityEjectionSystem;
    }

    public void setAvailabilityEjectionSystem(boolean availabilityEjectionSystem) {
        this.availabilityEjectionSystem = availabilityEjectionSystem;
    }

    public int getNumberOfRocket() {
        return numberOfRocket;
    }

    public void setNumberOfRocket(int numberOfRocket) {
        this.numberOfRocket = numberOfRocket;
    }

    @Override
    public String toString() {
        return "Военный самолет - {" + super.toString() + ", наличие системы катапультирования = " + availabilityEjectionSystem +
                ", кол-во ракет на борту = " + numberOfRocket+ " }";
    }
}
