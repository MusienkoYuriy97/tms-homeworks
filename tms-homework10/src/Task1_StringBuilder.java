import java.util.Scanner;

public class Task1_StringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи любое число: ");
        String inputStr = scanner.nextLine();
        System.out.print("Строковый вид через пробел: ");
        System.out.println(numbersBySpace(inputStr));
    }

    public static StringBuilder numbersBySpace(String str){
        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        for (int i = stringBuilder.length(); i < stringBuilder.length(); i+=4) {
            stringBuilder.insert(i," ");
        }
        return stringBuilder.delete(0,1).reverse();
    }
}

