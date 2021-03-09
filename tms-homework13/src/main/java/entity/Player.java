package entity;

import javax.xml.bind.annotation.XmlAttribute;

public class Player {
    private String name;

    public Player() {
    }

    @XmlAttribute(name = "Игрок")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
