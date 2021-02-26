import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи любое число: ");
        String inputStr = scanner.nextLine();
        System.out.print("Строковый вид через пробел: ");
        System.out.println(numbersBySpace(inputStr));
    }

    public static String numbersBySpace(String str){
        String result = str;
        List<String> list = new ArrayList<>();
        while (!result.isEmpty()) {
            if (result.length()%3 != 0){
                list.add(result.substring(0,result.length()%3));
                result = result.substring(result.length()%3);
            }else {
                list.add(result.substring(0,3));
                result = result.substring(3);
            }
        }
        return String.join(" ",list);
    }
}

