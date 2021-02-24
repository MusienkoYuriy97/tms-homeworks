package exercise2.instruments;

public class Accordion implements MusicInstrument {
    private String accordionType;

    public Accordion(String accordionType) {
        this.accordionType = accordionType;
    }

    public Accordion() {
    }

    @Override
    public void play(String songTitle) {
        System.out.print("Композиция - " + songTitle + " проигрывается на Аккордеоне");
    }

    public String getAccordionType() {
        return accordionType;
    }

    public void setAccordionType(String accordionType) {
        this.accordionType = accordionType;
    }


}
