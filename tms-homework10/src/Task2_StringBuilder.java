import java.util.Scanner;

public class Task2_StringBuilder {
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
        StringBuilder str = new StringBuilder();
        str.append(inputStr.toLowerCase());
        StringBuilder strReverse = new StringBuilder();
        strReverse.append(inputStr.toLowerCase()).reverse();

        return str.compareTo(strReverse) == 0;
    }
}
