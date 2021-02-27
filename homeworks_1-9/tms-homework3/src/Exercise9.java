import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int myArray[];
        int arrayLength;
        int C;
        int count = 0;
        double result = 0;

        System.out.println("Введи длинну массива");
        Scanner scanner = new Scanner(System.in);
        arrayLength = scanner.nextInt();
        myArray = new int[arrayLength];
        System.out.println("Введи любое число С");
        C = scanner.nextInt();

        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(5);
            if (myArray[i] > C){
                result += myArray[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(myArray) + " - Исходный массив");
        if (count != 0){
            System.out.println("Среднее арифметическое элементов массива больших числа С = " + result/(double)count);
        }else{
            System.out.println("В массиве нет чисел больших числа С");
        }

    }
}
