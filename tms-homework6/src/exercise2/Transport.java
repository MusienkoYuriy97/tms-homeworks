package exercise2;

public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    public Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public Transport() {
    }

    private double horsepowerToKW(){
        return power * 0.74;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "мощ. = " + power +
                "лош.с. или " + horsepowerToKW() + "кВ, макс.cк-ть = " + maxSpeed +
                " км/ч, масса = " + weight +
                "тонн, марка = '" + brand + '\'';
    }
}
