package exercise2.instruments;

public class Trumpet implements MusicInstrument{
    private String trumpetType;

    public Trumpet(String trumpetType) {
        this.trumpetType = trumpetType;
    }

    public Trumpet() {
    }

    @Override
    public void play(String songTitle) {
        System.out.print("Композиция - " + songTitle + " проигрывается на Трубе");
    }

    public String getTrumpetType() {
        return trumpetType;
    }

    public void setTrumpetType(String trumpetType) {
        this.trumpetType = trumpetType;
    }
}
