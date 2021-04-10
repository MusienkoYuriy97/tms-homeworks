import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number:");
        int x = scanner.nextInt();

        if (x > 0){
            x++;
        }else if (x < 0){
            x -= 2;
        }else {
            x = 10;
        }

        System.out.println(x + " is our final value");
    }
}
