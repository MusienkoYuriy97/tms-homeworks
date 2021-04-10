import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number:");
        int a = scanner.nextInt();
        System.out.print("Input second number:");
        int b = scanner.nextInt();
        System.out.print("Input third number:");
        int c = scanner.nextInt();

        int negativeNumber = 0;
        int positiveCounter = 0;

        if (a > 0){
            positiveCounter++;
        }
        else if (a < 0) {
            negativeNumber++;
        }

        if (b > 0){
            positiveCounter++;
        }else if (b < 0) {
            negativeNumber++;
        }

        if (c > 0){
            positiveCounter++;
        }  else if (c < 0) {
            negativeNumber++;
        }

        System.out.println("We have " + positiveCounter + " positive and " + negativeNumber + " negative numbers");
    }
}
