import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int myArray_1[];
        int countEven = 0;
        int myArray_2[];
        int index_myArray_2 = 0;
        int n;


        System.out.println("Введи число больше 3-х");
        Scanner scanner = new Scanner(System.in);
        do {
            n = scanner.nextInt();
            if (n < 3){
                System.out.println("Число должно быть больше трех, введи ещё!");
            }
        }while (n < 3);


        myArray_1 = new int[n];
        Random random = new Random();
        for (int i = 0; i < myArray_1.length; i++) {
            myArray_1[i] = random.nextInt(n+1);

            if (myArray_1[i] % 2 == 0 && myArray_1[i] != 0){
                countEven++;
            }
        }
        System.out.println(Arrays.toString(myArray_1) + " - Первый массив");


        myArray_2 = new int[countEven];
        for (int i = 0; i < myArray_1.length ; i++) {
            if (myArray_1[i] % 2 == 0 && myArray_1[i] != 0){
                myArray_2[index_myArray_2] = myArray_1[i];
                index_myArray_2++;
            }
        }
        System.out.println(Arrays.toString(myArray_2) + " - Второй массив состоящий из четных чисел первого");
    }
}
