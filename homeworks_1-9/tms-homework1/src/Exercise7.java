import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи количество программистов:");
        int numOfProgrammer = scanner.nextInt();

        if (numOfProgrammer % 10 == 0 || numOfProgrammer % 10 > 4 ||
                numOfProgrammer % 100 == 11 || numOfProgrammer == 11 ||
                (numOfProgrammer % 100 > 10 && numOfProgrammer % 100 < 20)) {
            System.out.println(numOfProgrammer + " программистов");
        } else if (numOfProgrammer == 1 || numOfProgrammer % 10 == 1) {
            System.out.println(numOfProgrammer + " программист");
        } else {
            System.out.println(numOfProgrammer + " программиста");
        }
    }
}
