import java.util.Scanner;

public class Task2_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи слова через пробел: ");
        String inputStr = scanner.nextLine();
        String[] strings = inputStr.split(" ");

        System.out.print("Палиндромы: ");
        for (String str: strings) {
            if (isPalindrome(str)){
                System.out.print(str + " ");
            }
        }
    }

    public static boolean isPalindrome(String inputStr){
        char[] chars = inputStr.toLowerCase().toCharArray();

        for (int i = 0; i < inputStr.length()/2; i++) {
            if (chars[i] != chars[chars.length-1-i]){
                return false;
            }
        }

        return true;
    }
}
