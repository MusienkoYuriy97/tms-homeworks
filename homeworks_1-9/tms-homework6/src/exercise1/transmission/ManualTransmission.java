package exercise1.transmission;

public class ManualTransmission extends Transmission {

    public ManualTransmission(int numberOfGears) {
        super(numberOfGears);
    }

    public ManualTransmission() {
    }

    @Override
    public void transmissionOn() {
        System.out.println("ManualTransmission on");;
    }
}
