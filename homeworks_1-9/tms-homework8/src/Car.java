import java.util.Random;

public class Car {
    private String brand;
    private int maxSpeed;
    private int price;
    private boolean flagStart = false;

    public Car(String brand, int maxSpeed, int price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public Car() {
    }

    public void start() throws EvenNumberException {
        Random random = new Random();
        int xR = random.nextInt(21);
        if (xR % 2 == 0 ){
            throw new EvenNumberException();
        }
        if (!flagStart){
            System.out.println("Автомобиль " + brand + " заведён.");
            flagStart = true;
        }else {
            System.out.println("Автомобиль " + brand + " уже заведён.");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
