package letters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class WrongLetter {


    public static List<Character> getWrongLetters(){
        List<Character> listWrongLetters = new LinkedList<>();
        try {
            List<String> listStrings = Files.readAllLines(Paths.get("src/main/java/letters/wrongLetter.txt"));
            for (String str : listStrings){
                listWrongLetters.add(str.charAt(0));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listWrongLetters;
    }
}
