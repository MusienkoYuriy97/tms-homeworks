package exercise1.transmission;

public class AutomatedManualTransmission extends Transmission{
    public AutomatedManualTransmission(int numberOfGears) {
        super(numberOfGears);
    }

    public AutomatedManualTransmission() {
    }

    @Override
    public void transmissionOn() {
        System.out.println("AutomatedManualTransmission on");
    }
}
