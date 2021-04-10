import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number:");
        int a = scanner.nextInt();
        System.out.print("Input second number:");
        int b = scanner.nextInt();

        if (a > b){
            System.out.println(a + " is more than " + b);
        }else if (a < b){
            System.out.println(a + " is less than " + b);
        }else {
            System.out.println("a equals b");
        }
    }
}
