package exercise2;

import exercise2.instruments.Accordion;
import exercise2.instruments.Guitar;
import exercise2.instruments.Trumpet;

import java.util.Arrays;

public class MainMusician {
    public static void main(String[] args) {
       //1.Тест композиций
        Musician musician1 = new Musician("Andrey",70,new Guitar(6,"Classic"));
        Musician musician2 = new Musician("Masha",40,new Accordion("Chromatic button"));
        Musician musician3 = new Musician("Denis",15,new Trumpet("Piccolo trumpet"));
        musician1.playSong("LiveForever");
        musician2.playSong("Justice");
        musician3.playSong("Winds of winter");

        //2.Квартет
        Musician[] musicians = new Musician[3];
        musicians[0] = new Musician("Yuriy",23, new Guitar(6,"Classic"));
        musicians[1] = new Musician("Dmitry",35, new Accordion("Chromatic button"));
        musicians[2] = new Musician("Anton",30, new Trumpet("Piccolo trumpet"));


        //находим старшего музыканта
        Musician oldestMusician = new Musician();
        for (int i = 0; i < musicians.length; i++) {
            if (musicians[i].getAge() > oldestMusician.getAge()){
                oldestMusician = musicians[i];
            }
        }
        System.out.println("Самый старший музыкант - " + oldestMusician.getName() + " ему " + oldestMusician.getAge() + " лет.") ;
        oldestMusician.playSong("В траве сидел кузнечик");
    }
}
