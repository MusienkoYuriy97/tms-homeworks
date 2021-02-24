package exercise2.instruments;

public class Guitar implements MusicInstrument {
    private int numberOfStrings;
    private String guitarType;

    public Guitar(int numberOfStrings, String guitarType) {
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    public Guitar() {
    }

    public void infoGuitar(){
        System.out.println(numberOfStrings + " - Количество струн у гитары");
    }


    @Override
    public void play(String songTitle) {
        System.out.print("Композиция - " + songTitle + " проигрывается на Гитаре");
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }
}


