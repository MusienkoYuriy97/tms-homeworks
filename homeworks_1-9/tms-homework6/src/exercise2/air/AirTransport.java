package exercise2.air;

import exercise2.Transport;

public class AirTransport extends Transport {
    private int wingspan;//размах крыльев
    private int minLengthOfRunway;

    public AirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minLengthOfRunway) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minLengthOfRunway = minLengthOfRunway;
    }

    public AirTransport() {
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinLengthOfRunway() {
        return minLengthOfRunway;
    }

    public void setMinLengthOfRunway(int minLengthOfRunway) {
        this.minLengthOfRunway = minLengthOfRunway;
    }

    @Override
    public String toString() {
        return super.toString() + ", размах крыльев = " + wingspan +
                "м., Мин. длина взлётно-посадочной полосы для взлёта = " + minLengthOfRunway + "м.";
    }
}
