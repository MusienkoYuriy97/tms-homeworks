package input;

import java.util.Scanner;

public class Input {
    private  static Scanner scanner = new Scanner(System.in);

    public static String getString(){
        return scanner.nextLine();
    }

    public static String getString( String message){
        System.out.print(message);
        return getString();
    }
}
