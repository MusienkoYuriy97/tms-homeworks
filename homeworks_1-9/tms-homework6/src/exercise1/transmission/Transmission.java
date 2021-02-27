package exercise1.transmission;

public class Transmission {
    private  int numberOfGears;

    public Transmission(int numberOfGears) {
        if (numberOfGears > 1 && numberOfGears < 12){
            this.numberOfGears = numberOfGears;
        }
    }

    public Transmission() {
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void transmissionOn(){

    }


}
