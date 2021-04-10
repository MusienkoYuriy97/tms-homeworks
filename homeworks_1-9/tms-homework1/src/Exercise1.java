import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        System.out.print("Input number:");
        int number = scanner.nextInt();
        int copyNumber = number;

        while (copyNumber / 10 != 0){
            copyNumber /= 10;
            count++;
        }

        if (number > 0){
            System.out.print(number + " - is a positive " + count + "-digit  number ");
        }else if (number < 0){
            System.out.print(number + " - is a negative " + count + "-digit  number ");
        }else {
            System.out.print("Zero is a neutral number.");
        }
    }
}
