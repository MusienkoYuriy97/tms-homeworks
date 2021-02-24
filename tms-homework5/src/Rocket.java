import java.util.Random;

public class Rocket {
    private String name;
    private int weightCargo;

    public Rocket() {
    }

    public Rocket(String name, int weightCargo) {
        this.name = name;
        this.weightCargo = weightCargo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightCargo() {
        return weightCargo;
    }

    public void setWeightCargo(int weightCargo) {
        this.weightCargo = weightCargo;
    }


    public boolean checkStart(){
        return new Random().nextInt(6) % 2 == 0;
    }

    public void start(){
        System.out.println("Ракета " + name + " успешно стартанула с грузом в " + weightCargo + "т.");
    }
}
