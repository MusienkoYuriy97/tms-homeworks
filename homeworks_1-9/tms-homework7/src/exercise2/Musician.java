package exercise2;

import exercise2.instruments.MusicInstrument;

import java.util.Objects;

public class Musician {
    private String name;
    private int age;
    private MusicInstrument musicInstrument;

    public Musician(String name, int age, MusicInstrument musicInstrument) {
        this.name = name;
        this.age = age;
        this.musicInstrument = musicInstrument;
    }

    public Musician() {
    }

    public void playSong(String songTitle){
        musicInstrument.play(songTitle);
        System.out.println(" музыкантом " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MusicInstrument getMusicInstrument() {
        return musicInstrument;
    }

    public void setMusicInstrument(MusicInstrument musicInstrument) {
        this.musicInstrument = musicInstrument;
    }
}
