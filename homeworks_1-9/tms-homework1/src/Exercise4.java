import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number:");
        int a = scanner.nextInt();
        System.out.print("Input second number:");
        int b = scanner.nextInt();
        System.out.print("Input third number:");
        int c = scanner.nextInt();
        int positiveCounter = 0;

        if (a > 0){
            positiveCounter++;
        }
        if (b > 0){
            positiveCounter++;
        }
        if (c > 0){
            positiveCounter++;
        }

        System.out.println("We have " + positiveCounter + " positive numbers");
    }
}
