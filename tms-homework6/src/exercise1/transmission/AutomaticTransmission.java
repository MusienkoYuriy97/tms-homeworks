package exercise1.transmission;

public class AutomaticTransmission extends Transmission{
    public AutomaticTransmission(int numberOfGears) {
        super(numberOfGears);
    }

    public AutomaticTransmission() {
    }

    @Override
    public void transmissionOn() {
        System.out.println("AutomaticTransmission on");
    }
}
