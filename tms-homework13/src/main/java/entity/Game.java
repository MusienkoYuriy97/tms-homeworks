package entity;

import letters.WrongLetter;
import input.Input;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.*;

public class Game {
    private final Move move = new Move();
    Player[] players = new Player[2];
    private final List<Character> listWrongLetters = WrongLetter.getWrongLetters();
    private String cityName = "";
    private char lastLetter = ' ';

    public Game() {
        players[0] = new Player();
        players[1] = new Player();
    }

    public void run(){
        System.out.println("��� ������������ ���� ������!");
        inputPlayers();
        start();
        createXML();
    }

    private void start(){
        int count = 0;
        while (!cityName.equalsIgnoreCase("������")){
            if (count % 2 == 0){
                playerMove(players[0]);
            }else {
                playerMove(players[1]);
            }
            count++;
        }
        if (count % 2  == 0){
            System.out.println(players[1].getName() + " - ������. ������� " + players[0].getName() + ".");
        }else {
            System.out.println(players[0].getName() + " - ������. ������� " + players[1].getName() + ".");
        }
    }

    private void playerMove(Player player){
        System.out.print("����� " + player.getName() + ". ");
        cityName = inputCity(player);
        saveCity(player);
    }

    private String inputCity(Player player){
        if (lastLetter == ' '){
            cityName = Input.getString("����� �������� ������: ");
        }else{
            cityName = Input.getString("����� �������� ������ ������������� � ����� " + lastLetter + ": ");
        }

        if (cityName.equalsIgnoreCase("������")){
            return cityName;
        }
        if (!move.getPlayerMoves().get(players[0]).isEmpty()){
            if (cityName.toLowerCase().charAt(0) != lastLetter){
                System.out.println("���� �� � ��� �����, ������� ����!!!");
                return inputCity(player);
            }
            if (containsCities(players[0], cityName) || containsCities(players[1], cityName)){
                System.out.println("����� ����� ��� ���, ����� ��� ���!!!");
                return inputCity(player);
            }
        }
        saveLastLetter();
        return cityName;
    }

    private void saveCity(Player player){
        if (!cityName.equalsIgnoreCase("������")){
            move.getPlayerMoves().get(player).getCities().add(cityName.toUpperCase());
        }
    }

    private void saveLastLetter(){
        if (checkLastLetter()){
            lastLetter = cityName.toLowerCase().charAt(cityName.length()-2);
        }else {
            lastLetter = cityName.toLowerCase().charAt(cityName.length()-1);
        }
    }

    private boolean containsCities(Player player, String city){
        return move.getPlayerMoves().get(player).getCities().contains(city.toUpperCase());
    }

    private boolean checkLastLetter(){
        return listWrongLetters.contains(cityName.toLowerCase().charAt(cityName.length()-1));
    }

    private void inputPlayers(){
        for (int i = 0; i < players.length; i++) {
            players[i].setName(Input.getString("����� ��� ������ " + (i+1) + ": "));
            move.add(players[i]);
        }
    }

    private void createXML(){
        try {
            JAXBContext context = JAXBContext.newInstance(Move.class, Cities.class,Player.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(move, new File("moves.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}