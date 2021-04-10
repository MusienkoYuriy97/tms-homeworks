import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Input the sides(a,b,c)  of triangle");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        if ( (a + b) > c && (b + c) > a && (a + c) > b){
            System.out.println("A triangle is exist");
        }else {
            System.out.println("A triangle doesn't exist");
        }
    }
}
